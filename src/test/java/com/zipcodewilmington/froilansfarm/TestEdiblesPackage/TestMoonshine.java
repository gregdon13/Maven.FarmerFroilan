package com.zipcodewilmington.froilansfarm.TestEdiblesPackage;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Moonshine;
import org.junit.Assert;
import org.junit.Test;

public class TestMoonshine {
    @Test
    public void testDistill(){
        //Arrange
        Moonshine moonshine = new Moonshine();

        //Action
        moonshine.distill(3);
        int expected = 3;
        int actual = moonshine.getNumberOfGrowlers();

        //Assert
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemoveGrowler(){
        //Arrange
        Moonshine moonshine = new Moonshine();
        moonshine.distill(3);

        //Action
        moonshine.removeGrowler(1);
        int expected = 2;
        int actual = moonshine.getNumberOfGrowlers();

        //Assert
        Assert.assertEquals(expected,actual);
    }
}
