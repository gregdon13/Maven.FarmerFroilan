package com.zipcodewilmington.froilansfarm.Routines;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.EdiblePackage.*;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;

public class RoutineEngine{
    Farmer froiland = new Farmer();
    Pilot froilanda = new Pilot();
    Farm farm = new Farm();
    Egg egg = new Egg();
    EarCorn earCorn = new EarCorn();
    Tomato tomato = new Tomato();
    Apple apple = new Apple();
    Pumpkin pumpkin = new Pumpkin();
    SoyBean soyBean = new SoyBean();


    public void dailyRoutine() {
        for (Horse horse : farm.stableOne.getStable()){
            froiland.mount(horse);
            froiland.dismount(horse);
            froiland.feedHorse(horse, apple);
            froiland.feedHorse(horse, earCorn);
        }
        for (Horse horse : farm.stableTwo.getStable()){
            froiland.mount(horse);
            froiland.dismount(horse);
            froiland.feedHorse(horse, apple);
            froiland.feedHorse(horse, earCorn);
        }
        for (Horse horse : farm.stableThree.getStable()){
            froiland.mount(horse);
            froiland.dismount(horse);
            froiland.feedHorse(horse, apple);
            froiland.feedHorse(horse, earCorn);
        }
        for (Chicken chicken : farm.coopOne.getCoop()) {
            froiland.feedChicken(chicken, earCorn);
            froiland.feedChicken(chicken, soyBean);
        }
        for (Chicken chicken : farm.coopTwo.getCoop()) {
            froiland.feedChicken(chicken, earCorn);
            froiland.feedChicken(chicken, soyBean);
        }
        for (Chicken chicken : farm.coopThree.getCoop()) {
            froiland.feedChicken(chicken, earCorn);
            froiland.feedChicken(chicken, soyBean);
        }
        for (Chicken chicken : farm.coopFour.getCoop()) {
            froiland.feedChicken(chicken, earCorn);
            froiland.feedChicken(chicken, soyBean);
        }
        froiland.eat(egg, 5);
        froiland.eat(tomato, 2);
        froiland.eat(earCorn, 1);
        froilanda.eat(egg, 2);
        froilanda.eat(earCorn,2);
        froilanda.eat(tomato,1);
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
