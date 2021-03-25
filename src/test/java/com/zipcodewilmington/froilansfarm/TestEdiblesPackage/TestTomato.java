package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TestTomato {
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        Tomato tomato = new Tomato();

        //Action
        boolean test = tomato.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        Tomato tomato = new Tomato();

        //Action
        boolean test = tomato.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }
}
