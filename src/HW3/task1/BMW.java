package HW3.task1;
import HW3.task1.Car;

import java.util.Arrays;

public class BMW extends Car implements Optionable{
    private String color;
    private final String model;
    private final String year;
    private String wheelSize;
    private final String engineVolume;
    private static String[] bmwDescription = new String[7];

    public BMW(String color, String model, String year, String wheelSize, String engineVolume) {
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

    public void addOptions(String option) {
        for (int i = 5; i < bmwDescription.length; i++){
          bmwDescription[i] = option;
          break;
        }
    }

    public void deleteOptions(String option) {
        for (int i = 5; i < bmwDescription.length; i++){
            if (bmwDescription[i].equals(option)) {
                bmwDescription[i] = null;
            }
            break;
        }
    }

    public void getDescription() {
        bmwDescription[0] = color;
        bmwDescription[1] = model;
        bmwDescription[2] = year;
        bmwDescription[3] = wheelSize;
        bmwDescription[4] = engineVolume;
        System.out.println(Arrays.toString(bmwDescription));
    }
}