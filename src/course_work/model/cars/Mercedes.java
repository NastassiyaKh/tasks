package course_work.model.cars;

import course_work.model.enums.forMercedes.*;

import java.util.Set;

import static java.lang.String.format;

public class Mercedes extends Car{
    private static final String REPRESENTATION_TEMPLATE = "Car{year: %s, model: %s, engineVol: %s, color: %s, wheelSize: %s, options: %s, seats: %s}";
    private SeatsForMercedes seats;

    public Mercedes(int year, ModelsForMercedes model, EngineVolumeForMercedes engineVolume, ColorsForMercedes color, WheelSizesForMercedes wheelSize, Set<OptionsForMercedes> options, SeatsForMercedes seats){
        super(year, model, engineVolume, color, wheelSize, options);
        this.seats = seats;
    }

    public SeatsForMercedes getSeats(){return seats;}

    public String toString() {
        return format(
                REPRESENTATION_TEMPLATE,
                year,
                model,
                engineVolume,
                color,
                wheelSize,
                options,
                seats
        );
    }
}
