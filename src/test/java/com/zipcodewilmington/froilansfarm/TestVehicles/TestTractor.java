package com.zipcodewilmington.froilansfarm.TestVehicles;

import com.zipcodewilmington.froilansfarm.Crops.AppleTrees;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.ProduceStand;
import com.zipcodewilmington.froilansfarm.Vehicles.*;
import org.junit.Assert;
import org.junit.Test;

public class TestTractor {
    @Test
    public void testInheritanceFarmVehicle(){
        //Arrange
        Tractor tractor = new Tractor();

        //Assertion
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void testImplementsVehicle(){
        //Arrange
        Tractor tractor = new Tractor();

        //Assertion
        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void testMakeNoise(){
        //Arrange
        Tractor tractor = new Tractor();;

        //Action
        String expected = "NnNnNn";
        String actual = tractor.makeNoise();

        //Assertion
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testHarvestRow() {
        //Given
        Tractor tractor = new Tractor();
        ProduceStand produceStand = new ProduceStand();
        Apple apple = new Apple();
        AppleTrees appleTrees = new AppleTrees();
        CropRow row = new CropRow(1, appleTrees);
        Field field = new Field(1, row);


        //When
        tractor.harvestRow(tractor.getRowKey(field.fieldMap, row));
        int numOfApples = produceStand.produceInventory(apple);

        //Then
        Assert.assertTrue(numOfApples < 11 && numOfApples > 0);
    }
}
