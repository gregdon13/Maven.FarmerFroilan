package com.zipcodewilmington.froilansfarm.EdiblePackage;

import java.util.ArrayList;

public class Moonshine {

    public int numberOfGrowlers = 0;

    public void distill(int numOfGrowl){
        numberOfGrowlers+= numOfGrowl;
    }

    public void removeGrowler(int growler){
        numberOfGrowlers -= growler;
    }

    public int getNumberOfGrowlers(){
        return numberOfGrowlers;
    }
}
