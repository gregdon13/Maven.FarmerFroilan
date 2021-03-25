package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Farmer implements Rider, Botanist, Person {

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

    public String eat(Edible obj) {
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
        return this.name + " gets off the " + obj + ".";
    }

    public void plant(Crop crop, CropRow cropRow) {

    }
}
