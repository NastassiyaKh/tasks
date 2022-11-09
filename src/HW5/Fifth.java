package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fifth {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public static void main(String[] args) throws IOException {
        int n1 = 0, m1 = 0, n2 = 0, m2 = 0;
        try {
            System.out.print("Количество строк первой матрицы: ");
            n1 = Integer.parseInt(reader.readLine());
            System.out.print("Количество столбцов первой матрицы: ");
            m1 = Integer.parseInt(reader.readLine());

            System.out.print("Количество строк второй матрицы: ");
            n2 = Integer.parseInt(reader.readLine());
            System.out.print("Количество столбцов второй матрицы: ");
            m2 = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int matr1[][] = new int[n1][m1];
        int matr2[][] = new int[n2][m2];
        try {
            input(matr1);
            input(matr2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        output(matr1);
        output(matr2);

        int res[][] = mul(matr1, matr2);
        output(res);

        reader.close();
    }

    private static void input(int[][] matr) throws NumberFormatException, IOException {
        int i, j;
        int n = matr.length, m = matr[0].length;
        System.out.println("Введите матрицу" + n + "X" + m);
        for (i = 0; i < n; ++i)
            for (j = 0; j < m; ++j)
                matr[i][j] = Integer.parseInt(reader.readLine());
    }

    private static int[][] mul(int[][] matr1, int[][] matr2) {
        int n1 = matr1.length, m1 = matr1[0].length, n2 = matr2.length, m2 = matr2.length;
        if (m1 != n2) {
            System.err.println("Матрицы нельзя умножить!");
            return new int[1][0];
        }
        int result[][] = new int[n1][m2];
        int i, j, k;
        for (i = 0; i < n1; ++i)
            for (j = 0; j < m2; ++j) {
                result[i][j] = 0;
                for (k = 0; k < m1; ++k)
                    result[i][j] = matr1[i][k] * matr2[k][j];
            }
        return result;
    }
    private static void output(int[][] matr) {
        int i, j;
        int n = matr.length, m = matr[0].length;
        System.out.println("Матрица:");
        for (i = 0; i < n; ++i, System.out.println())
            for (j = 0; j < m; ++j)
                System.out.print(String.valueOf(matr[i][j]) + " ");
    }
}