package course_work.service;

import course_work.model.cars.Car;
import course_work.model.interfaceForCar.WheelSize;

public interface ServiceForChangeWheelSize {
    static void changeWheelSize(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && !wheelSize.equals(car.getWheelSize())) {
            car.setWheelSize(wheelSize);
        }
    }
}