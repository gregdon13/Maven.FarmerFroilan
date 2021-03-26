package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;

public class AppleTrees extends Crop<Apple> {
    Apple apple = new Apple();

    public Apple yieldProd() {
        return apple;
    }
}
