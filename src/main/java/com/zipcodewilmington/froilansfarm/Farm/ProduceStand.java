package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.EdiblePackage.EdiblePlant;

import java.util.LinkedHashMap;

public class ProduceStand<E extends EdiblePlant> {
    LinkedHashMap<E, Integer> produceStand;

    public ProduceStand() {
        this.produceStand = new LinkedHashMap<E, Integer>();
    }

    public void addToStand(E produce, int quantity){
        if (produceStand.containsKey(produce)) {
            int inventory = produceStand.get(produce);
            inventory += quantity;
            produceStand.put(produce, inventory);
        } else {
            produceStand.put(produce, quantity);
        }
    }

    public void sellProduce(E produce, int quantity) {
        int currentStock = produceStand.get(produce);
        currentStock -= quantity;
        produceStand.put(produce, currentStock);
    }

    public int produceInventory(EdiblePlant crop) {
       return produceStand.get(crop);
    }
}
