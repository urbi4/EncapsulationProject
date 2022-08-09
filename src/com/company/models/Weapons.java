package com.company.models;

public class Weapons extends InventoryItem {
    private int damage;

    public Weapons(String name, int weight, int damage) {
        super(name, weight);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format("%s , damage: %d",super.toString(),getDamage());
    }
}
