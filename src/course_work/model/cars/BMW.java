package course_work.model.cars;

import course_work.model.enums.forBMW.*;

import java.util.Set;

import static java.lang.String.format;

public class BMW extends Car{
    private static final String REPRESENTATION_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s, gearboxType: %s}";
    private GearboxTypeForBMW gearboxType;

    public BMW(int year, ModelsForBMW model, EngineVolumeForBMW engineVolume, ColorsForBMW color, WheelSizesForBMW wheelSize, Set<OptionsForBMW> options, GearboxTypeForBMW gearboxType){
        super(year, model, engineVolume, color, wheelSize, options);
        this.gearboxType = gearboxType;
    }

    public GearboxTypeForBMW getGearboxType(){return gearboxType;}

    public String toString() {
        return format(
                REPRESENTATION_TEMPLATE,
                year,
                model,
                engineVolume,
                color,
                wheelSize,
                options,
                gearboxType
        );
    }
}
