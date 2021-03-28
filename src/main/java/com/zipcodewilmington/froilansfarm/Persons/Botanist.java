package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;

public interface Botanist extends Person {

    CropRow plant(Crop crop, CropRow cropRow, int numOfCrop);
}
