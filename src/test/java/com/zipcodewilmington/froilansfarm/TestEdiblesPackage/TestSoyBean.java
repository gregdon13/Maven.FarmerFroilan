package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.SoyBean;
import org.junit.Assert;
import org.junit.Test;

public class TestSoyBean {
    @Test
    public void testHasBeenFertilized(){
        //Arrange
        SoyBean bean = new SoyBean();

        //Action
        boolean test = bean.hasBeenFertilized();

        //Assertion
        Assert.assertFalse(test);
    }
    @Test
    public void testHasBeenHarvested(){
        //Arrange
        SoyBean bean = new SoyBean() ;

        //Action
        boolean test = bean.hasBeenHarvested();

        //Assertion
        Assert.assertFalse(test);
    }
}
