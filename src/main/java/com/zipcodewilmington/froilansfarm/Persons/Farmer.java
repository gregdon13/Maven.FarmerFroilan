package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.ChickenFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.HorseFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Moonshine;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Rideable;


import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Farmer implements Rider, Botanist, Person {
    Field field;

    Moonshine shine = new Moonshine();

    public String name;

    public Farmer() {}

    public Farmer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String eat(Edible obj, int numOfFood) {
        System.out.println("This food is downright edible!");
        return "This food is downright edible!";
    }

    public String makeNoise() {
        System.out.println("E-I-E-I-O");
        return "E-I-E-I-O";
    }

    public String mount(Rideable rideableObj) {
        System.out.println(this.name + " gets on the " + rideableObj + ".");
        return this.name + " gets on the " + rideableObj + ".";
    }

    public String dismount(Rideable obj) {
        System.out.println(this.name + " gets off the " + obj + ".");
        return this.name + " gets on the " + obj + ".";
    }

    public CropRow plant(Crop crop, CropRow cropRow, int numOfCrop) {
        for (int i = 0; i < numOfCrop; i++) {
            cropRow.plantCrops(crop);
        }
        return cropRow;
    }

    public boolean drankShine() {
        return true;
    }

    public boolean isDrunk(boolean drank){
        shine.removeGrowler(1);
        return true;
    }

    public void feedHorse(Horse horse, HorseFood food) {
        horse.eat(food);
    }
    public void feedChicken(Chicken chicken, ChickenFood food) {
        chicken.eat(food);
    }

    public String workFarmStand() {
        return "Fresh Produce 4 Sale";
    }
}
