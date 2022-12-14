package course_work.model.cars;

import course_work.model.enums.forAudi.*;
import course_work.model.interfaceForCar.Options;

import java.util.Set;

import static java.lang.String.format;

public class Audi extends Car{
    private static final String REPRESENTATION_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s, salon: %s}";
    private SalonForAudi salon;

    public Audi(int year, ModelsForAudi model, EngineVolumeForAudi engineVolume, ColorsForAudi color,
                WheelSizesForAudi wheelSize, Set<OptionsForAudi> options, SalonForAudi salon){
        super(year, model, engineVolume, color, wheelSize, options);
        this.salon = salon;
    }

    public SalonForAudi getSalon(){return salon;}

    public String toString() {
        return format(
                REPRESENTATION_TEMPLATE,
                year,
                model,
                engineVolume,
                color,
                wheelSize,
                options,
                salon
        );
    }

//    public static Audi createAudi(){
//        return new Audi();
//    }
}
