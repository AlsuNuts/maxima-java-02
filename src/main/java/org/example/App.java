package org.example;


public class App
{
    public static void main(String[] args ) {
        City tokio = new City ("tokio", 9100, true, true);
        Plane plane = new Plane ("Ан-124",125000, 865, 58.9f);
        plane.setRepairing(true);
        Ship ship = new Ship ("баржа", 250000, 35,12.7f);
        ship.setRepairing(true);
        Truck truck = new Truck ("БЗНК", 3000, 90, 13.4f);



        Logistics logistics = new Logistics(plane, ship, truck);
        TransportFactory factory = new TransportFactory();

        System.out.println(factory.getTransport(tokio, 2199, 350).getName());



        //Transport car = new Transport ("легковая",200, 100, 15.3f); //12240
        //Transport plane = new Plane ("ту-204",200, 100, 58.9f); //47120
        //Transport ship = new Ship ("баржа", 25000, 35,12.7f); //10160
        //Transport truck = new Truck ("БЗНК", 2000, 90, 13.4f); //10720

    }
}
