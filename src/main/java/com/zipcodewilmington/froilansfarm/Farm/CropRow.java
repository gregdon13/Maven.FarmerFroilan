package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;


public class CropRow {
    public ArrayList<Crop<EdiblePlant>> row = new ArrayList<Crop<EdiblePlant>>();

    public CropRow() {}

    public CropRow(int numOfCrop, Crop<EdiblePlant> crop) {
        for (int i = 0; i < numOfCrop; i++) {
            plantCrops(crop);
        }
    }

    public void plantCrops(Crop<EdiblePlant> crop) {
        row.add(crop);
    }

    public int harvestCrop(Crop<EdiblePlant> crop) {
        //Will return crop.Yield() which will be a random range
        return 0;
    }

//    public int harvestRow() {
//        int numOfVegYielded = 0;
//        for (Crop<EdiblePlant> crop : this.row) {
//            //Calls yield of the plant which returns a random number
//            //Add that to total of VegYielded for testing
//            row.remove(crop);
//        }
//        return numOfVegYielded;
//    }

    public int cropsPerRow() {
        return row.size();
    }
}