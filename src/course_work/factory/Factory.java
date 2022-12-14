package course_work.factory;

import course_work.factory.storage.*;
import course_work.model.interfaceForCar.*;

import java.util.Arrays;

import static java.lang.String.format;

public abstract class Factory <T, M extends Model, C extends Color, W extends WheelSize,
                               E extends EngineVolume, O extends Options, P extends Params> {
    private static final int YEAR = 2022;
    private final Color[] colors;
    private final Model[] models;
    private final WheelSize[] wheelSizes;
    private final EngineVolume[] engineVolumes;
    private final Storage storage;

    public Factory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, Storage storage) {
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolumes;
        this.storage = storage;
    }

    public abstract T createCar(M model, C color, W wheelSize, E engineVolume, O options, P params);

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(colors),
                Arrays.toString(models),
                Arrays.toString(wheelSizes),
                Arrays.toString(engineVolumes)
        );
    }
}
