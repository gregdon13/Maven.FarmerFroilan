package com.zipcodewilmington.froilansfarm.EdiblePackage;

public class Egg implements Edible{
    public boolean hasBeenFertilized() {
        return false;
    }

    public String getKeyStr() {
        return "Eggs";
    }
}
