package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {
    Crop crop = new Crop();


    @Test
    public void rowSize() {
        //Given
        CropRow row = new CropRow(12, crop);
        int expected = 12;

        //When
        int actual = row.cropsPerRow();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
