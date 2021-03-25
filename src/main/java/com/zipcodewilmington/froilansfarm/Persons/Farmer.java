package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Farmer implements Rider, Botanist, Person {
    public String eat(Edible obj) {
        System.out.println("This food is downright edible!");
        return "This food is downright edible!";
    }

    public String makeNoise() {
        System.out.println("E-I-E-I-O");
        return "E-I-E-I-O";
    }

    public String mount(Rideable obj) {
        return null;
    }

    public String dismount(Rideable obj) {
        return null;
    }

    public void plant(Crop crop, CropRow cropRow) {

    }
}
