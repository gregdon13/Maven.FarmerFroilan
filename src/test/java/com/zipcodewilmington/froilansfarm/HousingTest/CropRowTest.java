package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Crops.BeanStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {
    Crop crop = new Crop();
    Crop bean = new BeanStalk();


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

    @Test
    public void addCrop() {
        //Given
        CropRow row = new CropRow(5, bean);
        int expected = 7;

        //When
        row.plantCrops(bean);
        row.plantCrops(bean);
        int actual = row.cropsPerRow();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
