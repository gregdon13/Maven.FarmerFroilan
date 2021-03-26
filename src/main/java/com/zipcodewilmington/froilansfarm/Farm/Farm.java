package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.Crop;

import java.util.ArrayList;

public class Farm {
    CropRow row = new CropRow();
    Chicken chicken = new Chicken();
    Horse horse = new Horse();
    public Field field = new Field(5, row);

    public ChickenCoop coopOne = new ChickenCoop(4, chicken);
    public ChickenCoop coopTwo = new ChickenCoop(4, chicken);
    public ChickenCoop coopThree = new ChickenCoop(3, chicken);
    public ChickenCoop coopFour = new ChickenCoop(4, chicken);

    public Stable stableOne = new Stable(4, horse);
    public Stable stableTwo = new Stable(3, horse);
    public Stable stableThree = new Stable(3, horse);

    public Field getField() {
        return field;
    }
}
