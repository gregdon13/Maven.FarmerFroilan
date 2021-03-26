package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Moonshine;

public class Pilot implements Rider{
    Moonshine shine = new Moonshine();
    public String eat(Edible obj) {

        return null;
    }

    public String makeNoise() {
        return null;
    }

    public boolean drankShine() {
        return true;
    }

    public boolean isDrunk(boolean drank){
        shine.removeGrowler(1);
        return true;
    }
}
