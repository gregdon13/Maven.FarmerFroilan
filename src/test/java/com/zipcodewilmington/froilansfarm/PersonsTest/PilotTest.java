package com.zipcodewilmington.froilansfarm.PersonsTest;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Apple;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Pumpkin;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testNulleryContructor1() {
        // Arrange
        Pilot testPilot = new Pilot();
        String expectedName = "Froilanda";
        // Act
        String returnedName = testPilot.getName();
        // Assert
        Assert.assertEquals(expectedName, returnedName);
    }

    @Test
    public void testNulleryContructor2() {
        // Arrange
        Pilot testPilot = new Pilot();
        String expectedName = "Froilanda";
        // Act
        String returnedName = testPilot.getName();
        // Assert
        Assert.assertNotEquals(null, returnedName);
    }

    @Test
    public void getNameTest1() {
        // Arrange
        Pilot testPilot = new Pilot();
        // Act
        String returnedName = testPilot.getName();
        // Assert
        Assert.assertEquals("Froilanda", returnedName);
    }

    @Test
    public void getNameTest2() {
        // Arrange
        Pilot testPilot = new Pilot();
        // Act
        String returnedName = testPilot.getName();
        // Assert
        Assert.assertNotEquals(null, returnedName);
    }

    @Test
    public void makeNoiseTest1() {
        // Arrange
        String expected = "Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?";
        Pilot testPilot = new Pilot();
        // Act
        String returned = testPilot.makeNoise();
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void makeNoiseTest2() {
        // Arrange
        String expected = "I'm on a boat";
        Pilot testPilot = new Pilot();
        // Act
        String returned = testPilot.makeNoise();
        // Assert
        Assert.assertNotEquals(expected, returned);
    }

    @Test
    public void eatTestEgg() {
        // Arrange
        String expected = "Yum, this food is tasty";
        Pilot testPilot = new Pilot();
        Egg testEgg = new Egg();
        // Act
        String returned = testPilot.eat(testEgg, 2);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestApple() {
        // Arrange
        String expected = "Yum, this food is tasty";
        Pilot testPilot = new Pilot();
        Apple testApple = new Apple();
        // Act
        String returned = testPilot.eat(testApple,2 );
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void eatTestPumpkin() {
        // Arrange
        String expected = "Yum, this food is tasty";
        Pilot testPilot = new Pilot();
        Pumpkin testPumpkin = new Pumpkin();
        // Act
        String returned = testPilot.eat(testPumpkin, 2);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void mountTest1() {
        // Arrange
        Pilot testPilot = new Pilot();
        CropDuster testCropDuster = new CropDuster();
        String expected = "Froilanda gets on the " + testCropDuster.getName() + ".";
        // Act
        String returned = testPilot.mount(testCropDuster);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void mountTest2() {
        // Arrange
        Pilot testPilot = new Pilot();
        CropDuster testCropDuster = new CropDuster();
        String expected = "Froilanda gets on the " + testCropDuster.getName() + ".";
        // Act
        String returned = testPilot.mount(testCropDuster);
        // Assert
        Assert.assertNotEquals(null, returned);
    }

    @Test
    public void dismountTest1() {
        // Arrange
        Pilot testPilot = new Pilot();
        CropDuster testCropDuster = new CropDuster();
        // Act
        String expected = "Froilanda gets off the " + testCropDuster.getName() + ".";
        String returned = testPilot.dismount(testCropDuster);
        // Assert
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void dismountTest2() {
        // Arrange
        Pilot testPilot = new Pilot();
        CropDuster testCropDuster = new CropDuster();
        // Act
        String returned = testPilot.dismount(testCropDuster);
        // Assert
        Assert.assertNotEquals(null, returned);
    }
}
