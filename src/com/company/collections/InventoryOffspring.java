package com.company.collections;

import com.company.interfaces.InventoryInterface;
import com.company.models.InventoryItem;

import java.util.ArrayList;
import java.util.List;

public class InventoryOffspring extends ArrayList<InventoryItem> implements InventoryInterface { //potomek

    private int currentWeight = 0;
    private final int carryCapacity = 20;

    @Override
    public boolean add(InventoryItem inventoryItem) {
        if(currentWeight + inventoryItem.getWeight() <= carryCapacity){
            currentWeight += inventoryItem.getWeight();
            return super.add(inventoryItem);
        }
        return false;
    }

    @Override
    public int getCurrentWeight() {
        return 0;
    }
    @Override
    public String info() {
        List<String> strings = new ArrayList<>();
        for (InventoryItem ii : this) {
            strings.add("{" +ii+"}");
        }
        return strings.toString();
    }

}
