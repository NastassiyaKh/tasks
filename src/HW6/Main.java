package HW6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Country country1 = new Country(factory);
        Country country2 = new Country(factory);

        Thread factoryThread = new Thread(factory::createPart);
        Thread countryThread1 = new Thread(country1::createArmyOfRobots);
        Thread countryThread2 = new Thread(country2::createArmyOfRobots);


        factoryThread.setDaemon(true);
        factoryThread.start();
        countryThread1.start();
        countryThread2.start();

    }
}
