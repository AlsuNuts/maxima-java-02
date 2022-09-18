package org.example;
/*
Описать метод float getPrice(City city), возвращающий стоимость перевозки для нашего транспорта.
В обоих классах описать конструкторы с указанными свойствами в указанном порядке и геттеры-сеттеры всех свойств.
 */

public class Transport {

    private String name;       //название транспорта
    private int capacity;       //грузоподъемность
    private int speed;          //скорость
    private float costOfKm;     //стоимость за километр
    private float costPerTrip;       //стоимость за поездку


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

    public float getCostPerTrip() {
        return costPerTrip;
    }

    public void setCostPerTrip(float costPerTrip) {
        this.costPerTrip = costPerTrip;
    }

    public float getPrice(City city){
        float getCostPerTrip = getCostOfKm() * city.getDistanceKm();
        return getCostPerTrip;
    }
}
