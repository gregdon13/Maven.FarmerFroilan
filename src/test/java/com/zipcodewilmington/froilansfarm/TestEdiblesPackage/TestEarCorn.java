package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class TestEarCorn {
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        EarCorn corn = new EarCorn();

        //Action
        boolean test = corn.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        EarCorn corn = new EarCorn();

        //Action
        boolean test = corn.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }
}
