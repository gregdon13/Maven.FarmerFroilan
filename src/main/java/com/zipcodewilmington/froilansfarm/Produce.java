package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;

public interface Produce<E extends Edible> {

    E yieldProd();

}
