package HW3.task1;

public abstract class Car {
    protected String color;
    protected String model;
    protected String year;
    protected String wheelSize;
    protected String engineVolume;

    protected void changeColor(String changedColor){
        this.color = changedColor;
    };

    protected void changeWheelSize (String changedWheelSize){
        this.wheelSize = changedWheelSize;
    };

    protected abstract void getDescription();
}