package HW3.task1;

import HW3.task1.Car;
import HW3.task1.BMW;


public class Main {
    public static void main(String... args) {
        BMW bmw1 = new BMW("красная", "BMW M5", "2020", "18.7", "2.0");
        bmw1.changeColor("синяя");
        bmw1.changeWheelSize("19.2");
        bmw1.addOptions("кожаный салон");
        bmw1.deleteOptions("кожаный салон");
        bmw1.getDescription();

        Audi audi1 = new Audi("зеленая", "Ауди Q5", "2021", "18", "1.8");
        audi1.changeColor("оранжевая");
        audi1.changeWheelSize("18.2");
        audi1.getDescription();
    }
}