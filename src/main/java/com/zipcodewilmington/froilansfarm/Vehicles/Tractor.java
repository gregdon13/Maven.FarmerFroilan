package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;

public class Tractor extends FarmVehicle{
    public String makeNoise() {
        return "Clack-Clunk";
    }
    public void harvest(Crop crop){
        //method which calls to crop row and tells that its getting harvested af
    }
}
