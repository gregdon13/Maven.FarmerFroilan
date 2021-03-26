package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.SoyBean;
import com.zipcodewilmington.froilansfarm.Farm.ProduceStand;
import org.junit.Assert;
import org.junit.Test;

public class ProduceStandTest {
    SoyBean bean = new SoyBean();
    Apple apple = new Apple();

    @Test
    public void addProduce() {
        //Given
        ProduceStand produceStand = new ProduceStand();
        produceStand.addToStand(bean, 7);
        int expected = 7;

        //When
        int actual = produceStand.produceInventory(bean);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sellProduce() {
        //Given
        ProduceStand produceStand = new ProduceStand();
        produceStand.addToStand(apple, 12);
        produceStand.sellProduce(apple, 5);
        int expected = 7;

        //When
        int actual = produceStand.produceInventory(apple);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
