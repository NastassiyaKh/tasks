package HW2;

public class Values {
    public int[] lastValues;

    public Values() {
        lastValues = new int[5];
    }

    private void getLastValues(int a) {
        for (int i = 4; i > 0; i--) {
            this.lastValues[i] = this.lastValues[i - 1];
        }
        this.lastValues[0] = a;
    }

    private float getArithmeticalMean() {
        int sum = 0;
        for (int i = 0; i < this.lastValues.length; i++) {
            sum = sum + this.lastValues[i];
        }
        return (float) sum / 5;
    }

    public static void main(String[] args) {
        Values value = new Values();
        value.getLastValues(1);
        value.getLastValues(2);
        value.getLastValues(3);
        value.getLastValues(4);
        value.getLastValues(5);
        value.getLastValues(6);

        System.out.println(value.getArithmeticalMean());
    }
}


