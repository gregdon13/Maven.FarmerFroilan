package com.zipcodewilmington.froilansfarm.Routines;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.ChickenFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.HorseFood;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;

public class RoutineEngine{
    Farmer froiland = new Farmer();
    Farm farm = new Farm();

    public void dailyRoutine() {
        for (Horse horse : farm.stableOne.getStable()){
            froiland.mount(horse);
            froiland.dismount(horse);
            //feed horses
        }
        for (Horse horse : farm.stableTwo.getStable()){
            froiland.mount(horse);
            froiland.dismount(horse);
            //feed horses
        }
        for (Horse horse : farm.stableThree.getStable()){
            froiland.mount(horse);
            froiland.dismount(horse);
            //feed horses
        }
        for (Chicken chicken : farm.coopOne.getCoop()) {
            //feed chickens
        }
        for (Chicken chicken : farm.coopTwo.getCoop()) {
            //feed chickens
        }
        for (Chicken chicken : farm.coopThree.getCoop()) {
            //feed chickens
        }
        for (Chicken chicken : farm.coopFour.getCoop()) {
            //feed chickens
        }
    }

    public void Monday () {
        dailyRoutine();
    }
    public void Tuesday () {
        dailyRoutine();
    }
    public void Wednesday () {
        dailyRoutine();
    }
    public void Thursday () {
        dailyRoutine();
    }
    public void Friday () {
        dailyRoutine();
    }
    public void Saturday () {
        dailyRoutine();
    }
    public void Sunday () {
        dailyRoutine();
    }
}
