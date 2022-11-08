package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Third {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        List<Integer> values = new ArrayList();
        String number = null;
        try {
            while ((number = reader.readLine()) != null) {
                if (number.equals("stop")) {
                    break;
                } else if (number.equals("status")) {
                    Collections.sort(values);
                    for(int counter: values){
                        System.out.print(counter + " ");
                    }
                };
                try {
                    Integer i = Integer.parseInt(number);
                    System.out.println(i);
                    values.add(i);
                } catch (NumberFormatException e) {
                    System.err.println("Неправильный формат строки!");
                };
            };
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                double res = 0;
                for (int i = 0; i < values.size(); i++) {
                    res = res + values.get(i);
                }
                res = res / values.size();
                System.out.println(res);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
