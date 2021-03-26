package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.ProduceStand;
import com.zipcodewilmington.froilansfarm.Produce;
import javafx.util.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tractor<E extends Produce> extends FarmVehicle{
    Field field;
    ProduceStand produceStand;
    Crop crop = new Crop();
    private boolean readyToHarvest = false;


    public String makeNoise() {
        return "Clack-Clunk";
    }

    public boolean getReadyToHarvest(){
        if(crop.setFertilized()){
            return true;
        }
        return false;
    }

    public void harvestRow(int rowNum){
        CropRow cropRow = field.getCropRow(rowNum);
        Integer rowKey = getRowKey(field.getFieldMap(), cropRow);
        EdiblePlant ePlant = crop.yieldProd();
        Integer numOfEPlant = field.harvestRow(rowKey);
        produceStand.addToStand(ePlant, numOfEPlant);
    }


    public Integer getRowKey(Map<Integer, CropRow> map, CropRow value) {
        Integer rowKey = 0;
        for (Map.Entry<Integer, CropRow> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                rowKey = entry.getKey();
            }
        }
        return rowKey;
    }


//    public Integer getRowKey(Map<Integer, CropRow> map, CropRow value) {
//        int rowKey = 0;
//        for (Map.Entry<Integer, CropRow> entry : map.entrySet()) {
//            if (entry.getValue().equals(value)) {
//                rowKey = entry.getKey();
//            }
//        }
//        return rowKey;
//    }

}
