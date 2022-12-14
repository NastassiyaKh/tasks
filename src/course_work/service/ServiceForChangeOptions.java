package course_work.service;

import course_work.model.cars.*;
import course_work.model.interfaceForCar.Options;
import course_work.model.enums.forAudi.*;
import course_work.model.enums.forBMW.*;
import course_work.model.enums.forMercedes.*;

import java.util.Set;

public interface ServiceForChangeOptions {
    static void changeOptions(Car car, Set<? extends Options> option) {
        if (car != null && option != null && car.getOptions() != null) {
            if (car instanceof Audi && checkingAudiOptions(option) ||
                car instanceof BMW && checkingBMWOptions(option) ||
                car instanceof Mercedes && checkingMercedesOptions(option)) {
                car.setOptions(option);
            } else {
                System.out.println("wrong option");
            }
        }
    }

    static boolean checkingAudiOptions(Set<? extends Options> option){
        for(Options o : OptionsForAudi.values()){
            if (o.equals(option)){
                return true;
            }
        } return false;
    }

    static boolean checkingBMWOptions(Set<? extends Options> option){
        for(Options o : OptionsForBMW.values()){
            if (o.equals(option)){
                return true;
            }
        } return false;
    }

    static boolean checkingMercedesOptions(Set<? extends Options> option){
        for(Options o : OptionsForMercedes.values()){
            if (o.equals(option)){
                return true;
            }
        } return false;
    }
}