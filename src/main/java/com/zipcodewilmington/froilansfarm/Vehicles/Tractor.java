package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.ProduceStand;
import com.zipcodewilmington.froilansfarm.Produce;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tractor<E extends Produce> extends FarmVehicle{
    Field field = Field.getInstance();
    ProduceStand produceStand = ProduceStand.getInstance();
    Crop crop = new Crop();
    private boolean readyToHarvest = false;


    public String makeNoise() {
        return "Clack-Clunk";
    }

//    public void setFieldMap(LinkedHashMap<Integer, CropRow> fieldMap){
//        this.fieldMap = fieldMap;
//    }

    public boolean getReadyToHarvest(){
        if(crop.isFertilized){
            return true;
        }
        return false;
    }

//    public void harvestRow(int rowNum){
//        CropRow cropRow = field.fieldMap.get(rowNum);
//        Integer rowKey = getRowKey(field.fieldMap, cropRow);
//        EdiblePlant ePlant = crop.yieldProd();
//        Integer numOfEPlant = field.harvestRow(rowKey);
//        produceStand.addToStand(ePlant, numOfEPlant);
//    }

    public void harvestField() {
        for (CropRow<Crop> row : field.fieldMap.values()) {
            EdiblePlant current = null;
            int count = 0;
            for (Crop s : row.row) {
                current = s.yieldProd();
                count += s.howMuch();
            }
            produceStand.addToStand(current, count);
//        for (int i = 0; i < field.fieldMap.size(); i++) {
//            CropRow<Crop> row = field.getCropRow(i);
//            int count = 0;
//            Edible veg = null;
//            for (int j = 0; j < row.cropsPerRow(); j++) {
//                count += row.row.get(j).howMuch();
//                veg = row.row.get(j).yieldProd();
//            }
//            produceStand.addToStand(veg, count);
        }
    }



    public Integer getRowKey(Map<Integer, CropRow> map, CropRow value) {
        Integer rowKey = null;
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
