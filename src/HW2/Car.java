package HW2;

import java.util.Arrays;

public class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void changeColor(String colorReplacement) {
        String[] audiColors = {"Синий", "Красный", "Зеленый"};
        if (this.brand.equals("Audi") && Arrays.asList(audiColors).contains(colorReplacement)) {
            this.color = colorReplacement;
        }
        String[] bmwColors = {"Оранжевый", "Черный", "Фиолетовый"};
        if (this.brand.equals("Bmw") && Arrays.asList(bmwColors).contains(colorReplacement)) {
            this.color = colorReplacement;
        }
        String[] kiaColors = {"Желтый", "Серый", "Белый"};
        if (this.brand.equals("Kia") && Arrays.asList(kiaColors).contains(colorReplacement)) {
            this.color = colorReplacement;
        }
    }

    public static void main(String[] args) {
        String colorReplacement = "Черный";
        Car audi = new Car("Audi", "Синий");
        Car bmw = new Car("Bmw", "Оранжевый");
        Car kia = new Car("Kia", "Желтый");

        audi.changeColor(colorReplacement);
        bmw.changeColor(colorReplacement);
        kia.changeColor(colorReplacement);

        System.out.println(audi.brand + " " + audi.color);
        System.out.println(bmw.brand + " " + bmw.color);
        System.out.println(kia.brand + " " + kia.color);
    }
}
