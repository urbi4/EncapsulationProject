package com.company.interfaces;

import com.company.models.InventoryItem;

public interface InventoryInterface { // pouze hlavicky metod se zde budou vyskytovat, resi rpoblematiku jedne tridy ktera se mi vyskytuje nekolikrat ..
                                      // inverstionOfControl .. pouziva danou tridu, protoze implementuje rozhrani 

    public boolean add(InventoryItem item);
    public int getCurrentWeight();
    public InventoryItem get(int index);
    public String info();
}
