package com.zipcodewilmington.froilansfarm.PersonsTest;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Pumpkin;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {
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
        String returned = testFarmer.eat(testEgg);
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
        String returned = testFarmer.eat(testApple);
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
        String returned = testFarmer.eat(testPumpkin);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void mountTest1() {
    }
}
