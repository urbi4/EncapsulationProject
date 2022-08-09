package com.company.application;

import com.company.collections.Register;
import com.company.models.Food;
import com.company.models.InventoryItem;
import com.company.models.Weapons;

public class Main {

    public static void main(String[] args) {

        Register myInventory = new Register(20);

        InventoryItem i1 = new InventoryItem("Broken rake",1);
        InventoryItem i2 = new Food("Raw meat",3,10);
        InventoryItem i3 = new Weapons("Steel sword",4,13);

        if (i1 instanceof InventoryItem){ // reflexe, zjistuji info o kodu, jakeho typu je objekt
            System.out.println("je stejneho typu");
        }else{
            System.out.println("neni");
        }

        myInventory.add(new InventoryItem("Broken rake",1));
        myInventory.add(new Food("Raw meat",3,10));
        myInventory.add(new Food("Raw meat",3,10));
        myInventory.add(new Weapons("Golden sword",4,25));
        myInventory.add(new Weapons("Steel sword",4,13));

        System.out.println(myInventory.info());
        System.out.println(myInventory.get(2));
        System.out.println("Inventory weight: " +myInventory.getCurrentWeight());





    }
}
