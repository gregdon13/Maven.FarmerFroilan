package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Persons.Rider;

public abstract class FarmVehicle implements Vehicle {
    boolean operate(boolean bool) {
        return false;
    }

    public boolean isMounted(Rider riderObj) {
        String mounted = riderObj.mount(this);
        if (mounted.equals(riderObj + " gets on the " + this + ".")) return true;
        return false;
    }

    public String getName() {
        return null;
    }
}
