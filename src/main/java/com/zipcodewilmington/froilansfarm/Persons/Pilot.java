package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;

public class Pilot implements Rider{
    public String eat(Edible obj) {
        System.out.println("Yum, this food is tasty");
        return "Yum, this food is tasty";
    }

    public String makeNoise() {
        System.out.println("Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?");
        return "Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?";
    }
}
