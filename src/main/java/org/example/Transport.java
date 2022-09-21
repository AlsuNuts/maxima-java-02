package org.example;
/*
Описать три класса Ship, Plane и Truck, со свойствами и методами, аналогичными транспорту.
Для корабля и самолета при невозможности перевозки в указанный город метод float getPrice(City city) должен возвращать 0.
 */

public class Transport {

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

    public float getPrice(City city){
        float getCostPerTrip = getCostOfKm() * city.getDistanceKm();
        return getCostPerTrip;
    }


}
//Для корабля и самолета при невозможности перевозки в указанный город метод float getPrice(City city) должен возвращать 0.