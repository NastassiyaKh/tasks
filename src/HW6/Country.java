package HW6;

import java.util.HashMap;
import java.util.Map;

public class Country {
    private final Map<Factory.Parts, Integer> COUNTRY_DETAILS = new HashMap<>();
    private Factory factory;
    private static final int NUMBER_OF_ROBOTS = 5;

    public Country(Factory factory) {
        this.factory = factory;
    }

    public void createArmyOfRobots() {

        while (true) {
            synchronized (factory.stack) {
                if (factory.stack.isEmpty()) {
                    try {
                        factory.stack.wait();
                        continue;
                    } catch (InterruptedException e) {
                    }
                }

                Factory.Parts part = factory.stack.peek();
                Integer count = COUNTRY_DETAILS.get(part);
                if (count == null) {
                    COUNTRY_DETAILS.put(part, 1);
                    factory.stack.pop();
                } else if (count < NUMBER_OF_ROBOTS) {
                    COUNTRY_DETAILS.put(part, ++count);
                    factory.stack.pop();
                }

                if (getReady()) {
                    System.out.println("Армия из " + NUMBER_OF_ROBOTS + " роботов собрана " + Thread.currentThread().getName());
                    Thread.currentThread().interrupt();
                    break;
                } else {
                    try {
                        factory.stack.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public boolean getReady() {
        int status = 0;
        for (Factory.Parts part : Factory.Parts.values()) {
            if (this.COUNTRY_DETAILS.containsKey(part) && this.COUNTRY_DETAILS.get(part) == NUMBER_OF_ROBOTS) {
                status++;
            }
        }
        return status == 6;
    }
}
