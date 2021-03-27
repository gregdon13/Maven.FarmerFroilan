package com.zipcodewilmington.froilansfarm.Routines;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdiblePackage.*;
import com.zipcodewilmington.froilansfarm.Farm.*;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

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
    CropDuster cropDuster = new CropDuster();
    Tractor tractor = new Tractor();
    Moonshine moonshine = new Moonshine();
    CornStalk cornStalk = new CornStalk();
    BeanStalk beanStalk = new BeanStalk();
    AppleTrees appleTrees = new AppleTrees();
    PumpkinVines pumpkinVines = new PumpkinVines();
    TomatoPlant tomatoPlant = new TomatoPlant();
    Field oldField = new Field();
    Field field = oldField.getInstance();
    ProduceStand produceStand = ProduceStand.getInstance();


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
        froilanda.mount(cropDuster);
        cropDuster.fly();
        cropDuster.fertilizeField();
        froilanda.dismount(cropDuster);
    }
    public void Tuesday () {
        dailyRoutine();
        froiland.mount(tractor);
        tractor.harvestField();
        System.out.println(produceStand.produceStand);
        froiland.dismount(tractor);
    }
    public void Wednesday () {
        dailyRoutine();
        moonshine.distill(4);
    }
    public void Thursday () {
        dailyRoutine();
        for (Chicken chicken : farm.coopOne.getCoop()) {
            froiland.getEggs();
        }
        for (Chicken chicken : farm.coopTwo.getCoop()) {
            froiland.getEggs();
        }
        for (Chicken chicken : farm.coopThree.getCoop()) {
            froiland.getEggs();
        }
        for (Chicken chicken : farm.coopFour.getCoop()) {
            froiland.getEggs();
        }
    }
    public void Friday () {
        dailyRoutine();
        System.out.println(produceStand.produceStand);
        froiland.workFarmStand();
        froiland.isDrunk(froiland.drankShine());
        froilanda.isDrunk(froilanda.drankShine());
    }
    public void Saturday () {
        froiland.isDrunk(froiland.drankShine());
        froilanda.isDrunk(froilanda.drankShine());
        dailyRoutine();
    }
    public void Sunday () {
        dailyRoutine();
        CropRow<Crop> cropRow = new CropRow();
        field.getInstance().tillLand(1, cropRow);
        cropRow.add(appleTrees, 5);
        CropRow<Crop> cropRowTwo = new CropRow();
        field.getInstance().tillLand(2, cropRowTwo);
        cropRowTwo.add(cornStalk, 5);
        CropRow<Crop> cropRowThree = new CropRow();
        field.getInstance().tillLand(3, cropRowThree);
        cropRowThree.add(beanStalk, 5);
        CropRow<Crop> cropRowFour = new CropRow();
        field.getInstance().tillLand(4, cropRowFour);
        cropRowFour.add(tomatoPlant, 5);
        CropRow<Crop> cropRowFive = new CropRow();
        field.getInstance().tillLand(5, cropRowFive);
        cropRowFive.add(pumpkinVines, 5);
    }

    public void run() {
        Sunday();
        Monday();
        Tuesday();
        Wednesday();
        Thursday();
        Friday();
        Saturday();
    }
}
