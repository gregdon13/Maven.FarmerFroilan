package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.LivingThing;

import java.util.ArrayList;

public class Stable extends Housing<Horse>{
    ArrayList<Horse> stable;

    public Stable(int numOfHorses, Horse horse) {
        stable = new ArrayList<Horse>();
        for (int i = 0; i < numOfHorses; i++) {
            store(horse);
        }
    }
}
