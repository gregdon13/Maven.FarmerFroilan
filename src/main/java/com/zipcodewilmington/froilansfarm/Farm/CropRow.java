package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;


public class CropRow {
    ArrayList<Crop<EdiblePlant>> row = new ArrayList<Crop<EdiblePlant>>();

    public CropRow() {}

    public CropRow(int numOfCrop, Crop<EdiblePlant> crop) {
        for (int i = 0; i < numOfCrop; i++) {
            plantCrops(crop);
        }
    }

    public void plantCrops(Crop<EdiblePlant> crop) {
        row.add(crop);
    }

    public int cropsPerRow() {
        return row.size();
    }
}