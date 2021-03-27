package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {
    Farmer farmer = new Farmer();

    public String eat(Edible obj, int numOfFood) {
        System.out.println("munch munch munch");
        return "munch munch munch";
    }

    public String makeNoise() {
        System.out.println("Neeeighhh!");
        return "Neeeighhh!";
    }

    public boolean isMounted(Rider riderObj) {
        String mounted = riderObj.mount(this);
        if (farmer.mounted) { return true;
        }
        return false;
    }
}
