package com.company.models;

public class Food extends InventoryItem{ //dedicnost
    private int healthRestoration;

    public Food(String name, int weight, int healthRestoration) {
        super(name, weight);
        this.healthRestoration = healthRestoration;
    }

    public int getHealthRestoration() {
        return healthRestoration;
    }
    public void setHealthRestoration(int healthRestoration) {
        this.healthRestoration = healthRestoration;
    }

    @Override
    public String toString() {
        return String.format("%s ,healthRestoration: %d hp ",super.toString(),getHealthRestoration());
    }
}
