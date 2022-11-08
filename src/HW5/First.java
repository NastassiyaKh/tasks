package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String name = null;
        try {
            while ((name = reader.readLine()) != null){
                System.out.println(name);
            };
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
