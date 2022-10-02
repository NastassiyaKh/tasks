public class Task1_6 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 0},
                {0, 3}
        };
        int[][] b = {
                {1, -1},
                {3, -1}
        };
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        };
        System.out.println("сумма матриц:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        };
        int[][] d = new int[a.length][a.length];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = a[i][j] - b[i][j];
            }
        };
        System.out.println("разность матриц:");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        };
    }
}