package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.EdiblePackage.ChickenFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce, Eater {


    public String makeNoise() {
        System.out.println("Bok Bok!");
        return "Bok Bok!";
    }

    public void addProduce(Produce produce) {

    }


    public String eat(Edible obj) {
        System.out.println("Peck Peck");
        return "Peck Peck";
    }
}
