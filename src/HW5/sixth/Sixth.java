package HW5.sixth;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sixth {
    public static void main(String[] args) {
        int[][] values1 = readBoard("tasks/src/HW5/sixth/Filey1");
        int[][] values2 = readBoard("tasks/src/HW5/sixth/Filey2");
        output(values1);
        output(values2);
        int res[][] = mul(values1, values2);
        output(res);
    }
    public static int[][] readBoard(String boardFileName) {
        int[][] board = new int[2][2];
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(boardFileName));
            for(int i = 0; i < 2 && reader.ready(); i++) {
                String[] splittedRow = reader.readLine().split(" ");
                for(int j = 0; j < 2; j++) {
                    board[i][j] = Integer.parseInt(splittedRow[j]);
                }
            }
            return board;
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return board;
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