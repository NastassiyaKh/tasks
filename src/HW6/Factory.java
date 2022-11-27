package HW6;

import java.util.Random;
import java.util.Stack;

public class Factory {
    private final Random RANDOM = new Random();
    private final Parts[] PARTS = Parts.values();
    public Stack<Parts> stack = new Stack<>();

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
