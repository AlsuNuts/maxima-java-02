package org.example;


public class App
{


    public static void main(String[] args ) {
        City kazan = new City ("Казань", 800);
        String kazanName = kazan.getName();
        kazan.setName("Казань");
        int kazanDistanceKm = kazan.getDistanceKm();
        kazan.setDistanceKm(800);

        Transport car = new Transport ("легковая",200, 100, 15.3f);
        String carName = car.getName();
        car.setName("легковая");
        int carCapacity = car.getCapacity();
        car.setCapacity(200);
        int carSpeed = car.getSpeed();
        car.setSpeed(100);
        float carCostOfKm = car.getCostOfKm();
        car.setCostOfKm(15.3f);

        System.out.println(car.getPrice(new City ("Казань", 800)));
    }



}
