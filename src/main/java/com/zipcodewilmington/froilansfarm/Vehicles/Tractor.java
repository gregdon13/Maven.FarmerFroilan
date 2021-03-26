package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;

public class Tractor extends FarmVehicle{

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

    public void harvestRow(CropRow row){
    }
}
