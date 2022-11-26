package HW6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class Factory {
    private final Random RANDOM = new Random();
//    public final Map<Factory.Parts, Integer> STORAGE = new HashMap<>();

    public Stack<Parts> stack = new Stack<>();
    private final Parts[] PARTS = Parts.values();

    protected enum Parts {
        LEFT_HAND,
        RIGHT_HAND,
        LEFT_LEG,
        RIGHT_LEG,
        HEAD,
        BODY
    }

    public void createPart () {
        while (true) {
            synchronized (stack) {
                Parts part = PARTS[RANDOM.nextInt(0, 6)];
                stack.push(part);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {}
                stack.notifyAll();
            }
        }
    }
}
