package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.ChickenFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.HorseFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Moonshine;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.ProduceStand;
import com.zipcodewilmington.froilansfarm.Rideable;


import java.util.LinkedHashMap;

public class Farmer implements Rider, Botanist, Person {
    ProduceStand produceStand = ProduceStand.getInstance();
    LinkedHashMap<Integer, CropRow> fieldMap = Field.getInstance().fieldMap;
    Moonshine shine = new Moonshine();
    Chicken chicken = new Chicken();
    public String name;
    public boolean mounted = false;

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
        mounted = true;
        return this.name + " gets on the " + rideableObj + ".";
    }

    public String dismount(Rideable obj) {
        System.out.println(this.name + " gets off the " + obj + ".");
        mounted = false;
        return this.name + " gets on the " + obj + ".";
    }

    public void plant(int key, Crop crop, CropRow cropRow, int numOfCrop) {
        Field.getInstance().plantCrops(key, cropRow, crop, numOfCrop);
    }

    public boolean drankShine() {
        return true;
    }

    public boolean isDrunk(boolean drank){
        shine.removeGrowler(1);
        System.out.println("You're not on mute!");
        return true;
    }

    public void feedHorse(Horse horse, HorseFood food) {
        horse.eat(food);
    }
    public void feedChicken(Chicken chicken, ChickenFood food) {
        chicken.eat(food);
    }

    public void workFarmStand() {
        System.out.println("Fresh Produce 4 Sale");
    }

    public void getEggs() {
        int eggs = chicken.numOfEggs();
        produceStand.addToStand(chicken.yieldProd(), chicken.numOfEggs());
    }
}
