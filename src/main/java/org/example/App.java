package org.example;


public class App
{
    public static void main(String[] args ) {
        City kazan = new City ("Казань", 800, true, false);
        Plane plane = new Plane ("Ан-124",125000, 865, 58.9f);
        Ship ship = new Ship ("баржа", 250000, 35,12.7f);
        Truck truck = new Truck ("БЗНК", 3000, 90, 13.4f);


        Logistics logistics = new Logistics(plane, ship, truck);

        System.out.println(logistics.getShipping(kazan, 3000, 48));

        //Transport car = new Transport ("легковая",200, 100, 15.3f); //12240
        //Transport plane = new Plane ("ту-204",200, 100, 58.9f); //47120
        //Transport ship = new Ship ("баржа", 25000, 35,12.7f); //10160
        //Transport truck = new Truck ("БЗНК", 2000, 90, 13.4f); //10720

    }
}
