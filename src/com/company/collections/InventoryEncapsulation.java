package com.company.collections;

import com.company.interfaces.InventoryInterface;
import com.company.models.InventoryItem;

import java.util.ArrayList;
import java.util.List;

public class InventoryEncapsulation implements InventoryInterface { //zapouzdrenost ..

    private ArrayList<InventoryItem> items;
    private int currentWeight;
    private final int carryCapacity;

    public InventoryEncapsulation() {
        items = new ArrayList<>();
        currentWeight = 0;
        carryCapacity = 20;
    }

    @Override
    public boolean add(InventoryItem item) {
        if(currentWeight + item.getWeight() <= carryCapacity){
            items.add(item);
            currentWeight += item.getWeight();
            return true;
        }
        return false;
    }

    @Override
    public int getCurrentWeight() {
        return currentWeight;
    }

    @Override
    public InventoryItem get(int index) {
        return items.get(index);
    }

    @Override
    public String info() {
        List<String> strings = new ArrayList<>();
        for (InventoryItem ii : items) {
            strings.add("{" +ii+"}");
        }
        return strings.toString();
    }
}


