package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends Housing<Chicken>{
    ArrayList<Chicken> coop;

    public ChickenCoop(int numOfChickens, Chicken chicken) {
        coop = new ArrayList<Chicken>(numOfChickens);
        for (int i = 0; i < numOfChickens; i++) {
            store(chicken);
        }
    }

    public void store(Chicken chicken) {
        coop.add(chicken);
    }
}
