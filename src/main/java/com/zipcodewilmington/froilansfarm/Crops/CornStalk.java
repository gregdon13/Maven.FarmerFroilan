package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;

public class CornStalk extends Crop<EarCorn> {
    EarCorn earCorn = new EarCorn();

    public EarCorn yieldProd() {
        return earCorn;
    }
}
