package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import org.junit.Assert;
import org.junit.Test;

public class TestEgg {
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        Egg egg = new Egg();

        //Action
        boolean test = egg.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
}
