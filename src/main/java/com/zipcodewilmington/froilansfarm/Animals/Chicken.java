package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.EdiblePackage.ChickenFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.Produce;
import java.util.Random;


public class Chicken extends Animal implements Produce, Eater {


    private Egg egg = new Egg();

    public String makeNoise() {
        System.out.println("Bok Bok!");
        return "Bok Bok!";
    }

    public Egg yieldProd() {
        return egg;
    }


    public String eat(Edible obj, int numOfFood) {
        System.out.println("Peck Peck");
        return "Peck Peck";
    }

    public int numOfEggs() {
        Random randomAmount = new Random();
        return randomAmount.nextInt(5) + 1;
    }

}
