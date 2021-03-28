package com.zipcodewilmington.froilansfarm.TestVehicles;

import com.zipcodewilmington.froilansfarm.Crops.AppleTrees;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.ProduceStand;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicles.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

public class TestTractor {

    @Test
    public void testGetName() {
        // Arrange
        Tractor testTractor = new Tractor();
        String expectedName = "tractor";
        // Act
        String returnedName = testTractor.getName();
        // Assert
        Assert.assertEquals(expectedName, returnedName);
    }

    @Test
    public void testInheritanceFarmVehicle(){
        //Arrange
        Tractor<com.zipcodewilmington.froilansfarm.Produce> tractor = new Tractor<com.zipcodewilmington.froilansfarm.Produce>();

        //Assertion
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void testImplementsVehicle(){
        //Arrange
        Tractor<com.zipcodewilmington.froilansfarm.Produce> tractor = new Tractor<com.zipcodewilmington.froilansfarm.Produce>();

        //Assertion
        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void testMakeNoise(){
        //Arrange
        Tractor<com.zipcodewilmington.froilansfarm.Produce> tractor = new Tractor<com.zipcodewilmington.froilansfarm.Produce>();;

        //Action
        String expected = "NnNnNn";
        String actual = tractor.makeNoise();

        //Assertion
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testHarvestRow() {
        //Given
        Field field = Field.getInstance();
        CropRow row = new CropRow();
        AppleTrees appleTrees = new AppleTrees();
        field.tillLand(1, row);
        row.add(appleTrees, 1);
        Tractor<Produce> tractor = new Tractor();
        int expected = 1;

        //When
        ProduceStand produceStand = ProduceStand.getInstance();
        tractor.harvestField();
        int output = produceStand.produceStand.size();


        //Then
        Assert.assertEquals(expected, output);
    }
}
