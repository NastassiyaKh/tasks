package course_work.model.cars;

import course_work.model.interfaceForCar.*;
import course_work.service.*;

import java.util.Set;

import static java.lang.String.format;

public abstract class Car implements ServiceForChangeWheelSize, ServiceForChangeColor, ServiceForChangeOptions {
    private static final String REPRESENTATION_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s}";
    protected final int year;
    protected final Model model;
    protected final EngineVolume engineVolume;
    protected Color color;
    protected WheelSize wheelSize;
    protected Set<? extends Options> options;

    public Car(int year, Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<? extends Options> options) {
        this.year = year;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
        this.options = options;
    }

    public Model getModel() {
        return model;
    }

    public EngineVolume getEngineVolume() {
        return engineVolume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Set<? extends Options> getOptions() {
        return options;
    }

    public void setOptions(Set<? extends Options> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return format(
                REPRESENTATION_TEMPLATE,
                year,
                model,
                engineVolume,
                color,
                wheelSize,
                options
        );
    }
}
