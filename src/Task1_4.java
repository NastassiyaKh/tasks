public class Task1_4 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1},
                {2, -3}
        };
        int n = 0;
        int p = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > 0) {
                    p = p + 1;
                } else if (a[i][j] < 0) {
                    n = n + 1;
                }

            }
        }
        if (p > n) {
            System.out.println("В массиве больше положительных чисел");
        } else if (n < p) {
            System.out.println("В массиве больше отрицательных чисел");
        } else {
            System.out.println("В массиве одинаковое количество положительных и отрицательных чисел");
        }
    }
}
