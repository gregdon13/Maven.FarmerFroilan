package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;

public class CropDuster extends Aircraft{

    public String makeNoise() {
        return "NnNnNn";
    }

    public void fertilizeRow(CropRow row){
        for (Crop crop: row) {
            crop.yield(true);
        }
    }
}
