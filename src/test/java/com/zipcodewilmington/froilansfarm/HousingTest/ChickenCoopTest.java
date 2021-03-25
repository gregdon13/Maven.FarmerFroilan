package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {
    Chicken chicken = new Chicken();

    @Test
    public void coopSizeOne() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop(4, chicken);
        int expected = 4;

        //When
        int actual = chickenCoop.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void coopSizeTwo() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop(12, chicken);
        int expected = 12;

        //When
        int actual = chickenCoop.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
