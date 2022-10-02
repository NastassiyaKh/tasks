public class Task1_5 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 0, 0},
                {0, 3, 0, 0},
                {7, -1, 15, 0}
        };
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j <= a[i].length - 1; j++) {
                if (a[i][j] == 0) {
                    b = true;
                } else {
                    b = false;
                    break;
                }

            }
        }
        if (b) {
            System.out.println("Массив является нижней треугольной матрицей");
        } else {
            System.out.println("Массив не является нижней треугольной матрицей");
        }
    }
}
