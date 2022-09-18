package org.example;


public class App
{
    public static void main(String[] args ) {
        City kazan = new City ("Казань", false, true, 800);
        String kazanName = kazan.getName();
        kazan.setName("Казань");
        int kazanDistanceKm = kazan.getDistanceKm();
        kazan.setDistanceKm(800);

        Plane tu204 = new Plane ("ту-204",200, 100, 15.3f);

        System.out.println(tu204.getPrice(new City ("Казань", false, true,  800)));
    }
}
