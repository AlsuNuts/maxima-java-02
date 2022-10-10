package org.example;

public class Truck extends Transport {
    public Truck(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    float getPrice(City city) {
        return getCostOfKm() * city.getDistanceKm();
    }

    @Override
    public void startRepair() {

    }

    @Override
    public void finishRepair() {

    }

    @Override
    public boolean isRepairing() {
        return false;
    }
}
