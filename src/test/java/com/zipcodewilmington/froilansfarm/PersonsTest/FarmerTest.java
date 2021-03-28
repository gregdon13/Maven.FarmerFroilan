package com.zipcodewilmington.froilansfarm.PersonsTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.AppleTrees;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Pumpkin;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.ProduceStand;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testNulleryContructor1() {
        // Arrange
        Farmer testFarmer = new Farmer();
        String expectedName = "Sally";
        // Act
        testFarmer.setName(expectedName);
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals(expectedName, returnedName);
    }

    @Test
    public void testNulleryContructor2() {
        // Arrange
        Farmer testFarmer = new Farmer();
        String expectedName = "Sally";
        // Act
        testFarmer.setName(expectedName);
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Jim-Bob Jr.", returnedName);
    }

    @Test
    public void constructorTestName1() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals(expectedName, returnedName);
    }

    @Test
    public void constructorTestName2() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Bobby Joe", returnedName);
    }

    @Test
    public void setNameTest1() {
        // Arrange
        String givenName = "Darrell";
        Farmer testFarmer = new Farmer(givenName);
        // Act
        testFarmer.setName("Dolly");
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals("Dolly", returnedName);
    }

    @Test
    public void setNameTest2() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        testFarmer.setName("Dolly");
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Bobby Joe", returnedName);
    }

    @Test
    public void getNameTest1() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertEquals("Darrell", returnedName);
    }

    @Test
    public void getNameTest2() {
        // Arrange
        String expectedName = "Darrell";
        Farmer testFarmer = new Farmer(expectedName);
        // Act
        String returnedName = testFarmer.getName();
        // Assert
        Assert.assertNotEquals("Bobby Joe", returnedName);
    }

    @Test
    public void makeNoiseTest1() {
        // Arrange
        String expected = "E-I-E-I-O";
        Farmer testFarmer = new Farmer();
        // Act
        String returned = testFarmer.makeNoise();
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void makeNoiseTest2() {
        // Arrange
        String expected = "I'm on a boat";
        Farmer testFarmer = new Farmer();
        // Act
        String returned = testFarmer.makeNoise();
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void eatTestEgg() {
        // Arrange
        String expected = "This food is downright edible!";
        Farmer testFarmer = new Farmer();
        Egg testEgg = new Egg();
        // Act
        String returned = testFarmer.eat(testEgg, 2);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestApple() {
        // Arrange
        String expected = "This food is downright edible!";
        Farmer testFarmer = new Farmer();
        Apple testApple = new Apple();
        // Act
        String returned = testFarmer.eat(testApple, 2);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestPumpkin() {
        // Arrange
        String expected = "This food is downright edible!";
        Farmer testFarmer = new Farmer();
        Pumpkin testPumpkin = new Pumpkin();
        // Act
        String returned = testFarmer.eat(testPumpkin, 2);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void mountTest1() {
        // Arrange
        Farmer testFarmer = new Farmer("George");
        Horse testHorse = new Horse();
        String expected = "Geralt" + " gets on the " + testHorse + ".";
        // Act
        String returned = testFarmer.mount(testHorse);
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void mountTest2() {
        // Arrange
        Farmer testFarmer = new Farmer("Geralt");
        Horse testHorse = new Horse();
        String expected = "Geralt" + " gets on the " + testHorse + ".";
        // Act
        String returned = testFarmer.mount(testHorse);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void dismountTest1() {
        // Arrange

        Farmer testFarmer = new Farmer("Geralt");
        Horse testHorse = new Horse();
        String expected = "Geralt" + " gets off the " + testHorse + ".";
        // Act
        String returned = testFarmer.dismount(testHorse);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void dismountTest2() {
        // Arrange
        Farmer testFarmer = new Farmer("George");
        Horse testHorse = new Horse();
        String expected = "Geralt" + " gets on the " + testHorse + ".";
        // Act
        String returned = testFarmer.dismount(testHorse);
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void plantTest1() {
        // Arrange
        Crop appleTree1 = new AppleTrees();
        CropRow testCropRow = new CropRow();
        Farmer testFarmer = new Farmer();
        // Act
        testFarmer.plant(appleTree1, testCropRow, 3);
        int numOfCrops = testCropRow.cropsPerRow();
        // Assert
        Assert.assertEquals(3, numOfCrops);
    }

    @Test
    public void plantTest() {
        Field field = new Field();
        CropRow row = new CropRow();
        Farmer farmer = new Farmer();
        AppleTrees appleTrees = new AppleTrees();
        field.tillLand(1, row);
        farmer.plant(appleTrees, field.getCropRow(1), 5);
        int expected = 5;
        System.out.println(Field.getInstance().fieldMap);

        int actual = field.getCropRow(1).cropsPerRow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantTest2() {
        // Arrange
        Crop appleTree1 = new AppleTrees();
        CropRow testCropRow = new CropRow();
        Farmer testFarmer = new Farmer();
        // Act
        testFarmer.plant(appleTree1, testCropRow, 3);
        int numOfCrops = testCropRow.cropsPerRow();
        // Assert
        Assert.assertNotEquals(0, numOfCrops);
    }

    @Test
    public void getEggsTest() {
        //Given
        ProduceStand produceStand = ProduceStand.getInstance();
        Farmer farmer = new Farmer();
        int expected = 1;

        //When
        farmer.getEggs();
        int actual = produceStand.produceStand.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
