package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Moonshine;

import com.zipcodewilmington.froilansfarm.Rideable;

public class Pilot implements Rider, Person {
    public boolean mounted = false;
    String name;
    Moonshine shine = new Moonshine();


    public Pilot() {
        this.name = "Froilanda";
    }

    public String getName() {
        return name;
    }

    public String eat(Edible obj, int numOfFood) {
        System.out.println("Yum, this food is tasty");
        return "Yum, this food is tasty";
    }

    public String makeNoise() {
        System.out.println("Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?");
        return "Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?";
    }

    public String mount(Rideable rideableObj) {
        System.out.println(this.name + " gets on the " + rideableObj.getName() + ".");
        mounted = true;
        return this.name + " gets on the " + rideableObj.getName() + ".";
    }

    public String dismount(Rideable obj) {
        System.out.println(this.name + " gets off the " + obj.getName() + ".");
        mounted = false;
        return this.name + " gets off the " + obj.getName() + ".";
    }

    public boolean drankShine() {
        return true;
    }

    public boolean isDrunk(boolean drank){
        shine.removeGrowler(1);
        return true;
    }
}
