package org.example;

public abstract class Transport implements Repairable {
    private String name;       //название транспорта
    private int capacity;       //грузоподъемность
    private int speed;          //скорость
    private float costOfKm;     //стоимость за километр

    public Transport(String name, int capacity, int speed, float costOfKm) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.costOfKm = costOfKm;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public float getCostOfKm() {
        return costOfKm;
    }
    public void setCostOfKm(float costOfKm) {
        this.costOfKm = costOfKm;
    }

    abstract float getPrice(City city);
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



//float getCostPerTrip = getCostOfKm() * city.getDistanceKm();
//        return getCostPerTrip;