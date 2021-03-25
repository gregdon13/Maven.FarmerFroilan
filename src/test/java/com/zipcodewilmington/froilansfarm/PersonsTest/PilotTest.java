package com.zipcodewilmington.froilansfarm.PersonsTest;

import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

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
}
