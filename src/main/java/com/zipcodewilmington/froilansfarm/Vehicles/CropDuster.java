package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;


public class CropDuster extends Aircraft {

    Field field = Field.getInstance();

    public String makeNoise() {
        return "NnNnNn";
    }

    public void fertilizeField (){
        for (CropRow<Crop> row : field.fieldMap.values()) {
            for (Crop s : row.row) {
                s.setFertilized(true);
            }
        }
    }
}
