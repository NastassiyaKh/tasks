package course_work.service;

import course_work.model.cars.Car;
import course_work.model.interfaceForCar.Color;

public interface ServiceForChangeColor {
    static void changeColor(Car car, Color color) {
        if (car != null && color != null && !color.equals(car.getColor())) {
            car.setColor(color);
        }
    }
}