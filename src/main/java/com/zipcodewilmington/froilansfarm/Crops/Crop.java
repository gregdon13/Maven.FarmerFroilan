package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.Produce;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

public class Crop<E extends EdiblePlant> implements Produce {

    private LinkedHashMap<EdiblePlant, Integer> basket;
    public boolean isFertilized;

    public Crop() {
        LinkedHashMap<EdiblePlant, Integer> basket = new LinkedHashMap<EdiblePlant, Integer>();
    }

    public boolean getFertilized(){
        return this.isFertilized;
    }

    public void setFertilized(boolean fertilized){
        isFertilized = fertilized;
    }

    public boolean yield(boolean isFertilized){
        if(isFertilized){
            return true;
        }
        return false;
    }
    public int howMuch(){
        Random randomAmount = new Random();
        return randomAmount.nextInt(10) + 1;
    }

    public E yieldProd() {
        return null;
    }
}
