package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Persons.Rider;


public class CropDuster extends Aircraft {

    String name;
    Field field = Field.getInstance();
    Pilot pilot = new Pilot();

    public CropDuster() {
        this.name = "plane";
    }

    public boolean isMounted(Rider obj) {
        String mounted = obj.mount(this);
        if (pilot.mounted) { return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

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
