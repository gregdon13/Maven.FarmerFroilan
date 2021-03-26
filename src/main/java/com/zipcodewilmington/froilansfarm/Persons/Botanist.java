package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;

public interface Botanist extends Person {
    void plant(int key, Crop crop, CropRow cropRow, int numOfCrop);
}
