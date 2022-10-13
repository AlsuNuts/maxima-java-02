package org.example;

public class TransportFactory {
    public Transport getTransport(City city, int weight, int hours){
        final String PLANE_NAME = "самолет";
        final float PLANE_COST_OF_KM = 58.9f;
        final String SHIP_NAME = "баржа";
        final float SHIP_COST_OF_KM = 12.7f;
        final String TRUCK_NAME = "БЗНК"; //тем, кто любит гаражный панк-рок, рекомендую к прослушиванию Truckdrivers - Безумцы землю ногами крутят
        final float TRUCK_COST_OF_KM= 13.4f;



        int roundedSpeed = city.getDistanceKm()/hours; //скорость, необходимая лдля прибытия в срок
        int transportWeight = (weight % 500 != 0) ? (int) Math.ceil(weight/500) * 500 : weight;
        int transportSpeed = (roundedSpeed % 10 != 0) ? (int) Math.ceil(roundedSpeed) * 10 : roundedSpeed;

        if (transportSpeed<40 & city.isOnWater()){
            return new Ship(SHIP_NAME, transportWeight, transportSpeed, SHIP_COST_OF_KM);
        }
        if (transportSpeed>120 & city.hasAirport()){
            return new Plane(PLANE_NAME, transportWeight, transportSpeed, PLANE_COST_OF_KM);
        }
        return new Truck(TRUCK_NAME, transportWeight, transportSpeed, TRUCK_COST_OF_KM);
    }
}

/*
        if (weight % 500 != 0){
            weight = (int) Math.ceil(weight/500) * 500;
        }
        if (transportSpeed % 10 != 0) {
            transportSpeed = (int) Math.ceil(transportSpeed) * 10;
        }
 */
