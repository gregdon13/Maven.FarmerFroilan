package com.zipcodewilmington.froilansfarm.Farm;

import java.util.ArrayList;

public class Field {
    ArrayList<CropRow> field = new ArrayList<CropRow>();

    public Field() {}

    public Field(int numOfRows, CropRow row) {
        for (int i = 0; i < numOfRows; i++) {
            tillLand(row);
        }
    }

    public void tillLand(CropRow row) {
        field.add(row);
    }

    public int fieldSize() {
        return field.size();
    }

}
