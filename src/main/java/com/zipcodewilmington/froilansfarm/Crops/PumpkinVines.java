package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Pumpkin;

public class PumpkinVines extends Crop<Pumpkin>{
    Pumpkin pumpkin = new Pumpkin();

    public Pumpkin yieldProd() {
        return pumpkin;
    }
}
