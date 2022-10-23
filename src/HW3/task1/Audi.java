package HW3.task1;

import java.util.Arrays;

public class Audi  extends Car{
    private String color;
    private final String model;
    private final String year;
    private String wheelSize;
    private final String engineVolume;
    private static String[] audiDescription = new String[5];

    public Audi (String color, String model, String year, String wheelSize, String engineVolume) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
    }

    protected void changeColor(String changedColor) {
        this.color = changedColor;
    }

    protected void changeWheelSize (String changedWheelSize){
        this.wheelSize = changedWheelSize;
    }

    public void getDescription() {
        audiDescription[0] = color;
        audiDescription[1] = model;
        audiDescription[2] = year;
        audiDescription[3] = wheelSize;
        audiDescription[4] = engineVolume;
        System.out.println(Arrays.toString(audiDescription));
    }
}