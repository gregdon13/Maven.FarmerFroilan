package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Persons.Rider;

public abstract class Aircraft implements Vehicle {
    public String fly() {
        return "I am serious... and don't call me Shirley";
    }

    public boolean isMounted(Rider obj) {
        return false;
    }
}
