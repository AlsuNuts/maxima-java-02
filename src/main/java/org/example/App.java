package org.example;


public class App
{
    public static void main(String[] args ) {
        City kazan = new City ("Казань", 800);
        String kazanName = kazan.getName();
        kazan.setName("Казань");
        int kazanDistanceKm = kazan.getDistanceKm();
        kazan.setDistanceKm(800);
        boolean kazanHasAirport = kazan.hasAirport();
        //kazan.setHasAirport(true);
        boolean kazanIsOnWater = kazan.isOnWater();
        //kazan.setIsOnWater(true);

        Transport car = new Transport ("легковая",200, 100, 15.3f); //12240
        Transport plane = new Plane ("ту-204",200, 100, 58.9f); //47120
        Transport ship = new Ship ("грузовое судно", 25000, 85,12.7f); //10160
        Transport truck = new Truck ("БЗНК", 2000, 90, 13.4f); //10720

        //System.out.println(plane.getName());
        //System.out.println(kazan.hasAirport());
        //System.out.println(kazan.isOnWater());

        System.out.println(plane.getPrice(new City ("Казань",800)));
    }
}
