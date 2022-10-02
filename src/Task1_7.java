public class Task1_7 {
    public static void main(String[] args) {
        int[] a = {1, 0, 4, 8, 9, 1};
        int sum1 = 0;
        int sum2 = 0;
        for (int x = 0; x < a.length; x += 1) {
            if (x % 2 == 0) {
                sum1 = sum1 + a[x];
            }
        };
        for (int x = 0; x < a.length; x += 1) {
            if (x % 2 != 0) {
                sum2 = sum2 + a[x];
            }
        };
        if (sum1 > sum2) {
            System.out.print("Максимально возможная сумма равна " + sum1);
        } else if (sum2 > sum1) {
            System.out.print("Максимально возможная сумма равна " + sum2);
        };
    }
}
