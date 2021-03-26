package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Tomato;

public class TomatoPlant extends Crop<Tomato> {
    Tomato tomato = new Tomato();


    public Tomato yieldProd() {
        return tomato;
    }
}
