package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fourth {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        String sign = getOperator();
        double res = calc(num1, num2, sign);
        System.out.println(res);
    }

    public static int getInt() {
        System.out.println("Введите число");
        int i = 0;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        try {
            i = Integer.parseInt(String.valueOf(reader.readLine()));
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return i;
    }

    public static String getOperator() {
        System.out.println("Введите то, что вы хотите сделать");
        String sign = "fi";
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        try {
            sign = reader.readLine();
            if (sign.equals("-") || sign.equals("+") || sign.equals("*") || sign.equals("/")){
                return sign ;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sign;
    }

    public static double calc(int num1, int num2, String sign) {
        double result = 0;
        switch (sign) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Кто ж делит на 0");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
        return result;
    }
}