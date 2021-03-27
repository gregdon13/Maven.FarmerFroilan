package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.EdiblePackage.*;

import java.util.LinkedHashMap;

public class ProduceStand<E extends Edible> {

    private static ProduceStand produce_stand = null;

    public LinkedHashMap<E, Integer> produceStand;

    private ProduceStand() {
        this.produceStand = new LinkedHashMap();
    }

    public static ProduceStand getInstance() {
        if (produce_stand == null) {
            produce_stand = new ProduceStand();
        }
        return produce_stand;
    }

    public void addToStand(E produce, int quantity){
        if (produceStand.containsKey(produce)) {
            Integer inventory = produceStand.get(produce);
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

    public int produceInventory(E produce) {
       return produceStand.get(produce);
    }

}
