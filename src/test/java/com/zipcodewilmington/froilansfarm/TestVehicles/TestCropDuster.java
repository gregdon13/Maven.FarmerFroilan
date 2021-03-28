package com.zipcodewilmington.froilansfarm.TestVehicles;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TestCropDuster {

    @Test
    public void getNameTest() {
    // Arrange
    CropDuster testCropDuster = new CropDuster();
    String nameExpected = "plane";
    // Act
    String returnedName = testCropDuster.getName();
    // Assert
    Assert.assertEquals(nameExpected, returnedName);
    }

    @Test
    public void testInheritanceAirCraft(){
        //Arrange
        CropDuster duster = new CropDuster();

        //Assertion
        Assert.assertTrue(duster instanceof Aircraft);
    }
    @Test
    public void testImplementsVehicle(){
        //Arrange
        CropDuster duster = new CropDuster();

        //Assertion
        Assert.assertTrue(duster instanceof Vehicle);
    }
    @Test
    public void testMakeNoise(){
        //Arrange
        CropDuster duster = new CropDuster();

        //Action
        String expected = "NnNnNn";
        String actual = duster.makeNoise();

        //Assertion
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void fertilizedCrops() {
        //Given
        CropDuster duster = new CropDuster();
        CornStalk cornStalk = new CornStalk();
        Field field = Field.getInstance();
        CropRow cropRow = new CropRow(1, cornStalk);
        field.fieldMap.put(1, cropRow);

        //When
        duster.fertilizeField();
        boolean actual = cornStalk.getFertilized();

        //Then
        Assert.assertTrue(actual);
    }
}
