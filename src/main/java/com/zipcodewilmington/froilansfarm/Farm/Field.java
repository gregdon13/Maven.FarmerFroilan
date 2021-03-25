package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Field {
    Map<Integer, CropRow> fieldMap = new LinkedHashMap<Integer, CropRow>();
    CropRow cropRow = new CropRow();
    Crop<EdiblePlant> crop = new Crop<EdiblePlant>();

    public Field() {}

    public Field(int numOfRows, CropRow row) {
        for (int i = 0; i < numOfRows; i++) {
            tillLand(i, row);
        }
    }

    public void tillLand(int rowNum, CropRow row) {
        fieldMap.put(rowNum, row);
    }

    public int fieldSize() {
        return fieldMap.size();
    }

    public int harvestRow(int rowNum) {
        int numOfVeg = 0;
        for (int i = 0; i < fieldMap.get(rowNum).cropsPerRow(); i++) {
            //Will call harvestCrop which calls yield
            //Add to numOfVeg
        }
        return numOfVeg;
    }

}
