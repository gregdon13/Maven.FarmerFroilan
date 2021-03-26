package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;

import java.util.LinkedHashMap;
import java.util.Map;

public class Field {
    private static Field field_instance = null;

    CropRow cropRow = new CropRow();
    public LinkedHashMap<Integer, CropRow> fieldMap;

    public Field() {
        fieldMap = new LinkedHashMap<Integer, CropRow>();
    }

    public static Field getInstance() {
        if (field_instance == null) {
            field_instance = new Field();
        }
            return field_instance;
    }

    public Field(int numOfRows, CropRow row) {
        fieldMap = new LinkedHashMap<Integer, CropRow>();
        for (int i = 1; i <= numOfRows; i++) {
            tillLand(i, row);
        }
    }

    public LinkedHashMap<Integer, CropRow> getHashMap(){
        return fieldMap;
    }

    public void setFieldMap(LinkedHashMap map){
        this.fieldMap = map;
    }

    public void tillLand(int rowNum, CropRow row) {
        if (!Field.getInstance().getFieldMap().containsKey(rowNum)) {
            Field.getInstance().getFieldMap().put(rowNum, row);
        } else {
            System.out.println("You already have crops there!");
        }
    }

    public int fieldSize() {
        return Field.getInstance().fieldSize();
    }

    public int harvestRow(int rowNum) {
        int numOfVeg = 0;
        for (int i = 0; i < fieldMap.get(rowNum).cropsPerRow(); i++) {
            numOfVeg += cropRow.harvestCrop(fieldMap.get(rowNum).cropType(i));
        }
        return numOfVeg;
    }

    public CropRow getCropRow(Integer rowNum) {
        return Field.getInstance().fieldMap.get(rowNum);
    }

    public LinkedHashMap<Integer, CropRow> getFieldMap() {
        return this.fieldMap;
    }

    public void plantCrops(int key, CropRow row, Crop crop, int numOfCrop) {
        if (Field.getInstance().getFieldMap().containsKey(key)) {
            Field.getInstance().fieldMap.get(key).add(crop, numOfCrop);
        }
        Field.getInstance().fieldMap.put(key, row);
    }
}
