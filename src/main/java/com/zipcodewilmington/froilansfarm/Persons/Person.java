package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.LivingThing;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public interface Person extends LivingThing, Eater, NoiseMaker{

    boolean drankShine();

    String eat(Edible obj, int numOfFood);
}

