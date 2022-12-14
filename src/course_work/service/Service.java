package course_work.service;

import course_work.model.cars.*;
import course_work.model.interfaceForCar.*;

import java.util.Set;

public class Service implements ServiceForChangeColor, ServiceForChangeOptions, ServiceForChangeWheelSize{
    public void changeColor(Car car, Color color) {}
    public void changeWheelSize(Car car, WheelSize wheelSize) {}
    public void changeOptions(Car car, Set<? extends Options> option) {}
}
