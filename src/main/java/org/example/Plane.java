package org.example;

public class Plane extends Transport{
    public Plane(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }
    public float getPrice(City city){
        return (!city.hasAirport() ? 0f  : super.getPrice(city));
    }
}
// String name, int distanceKm
//  return (!city.hasAirport()) ? 0f  : super.getPrice(city);
//     return (!city.hasAirport()) ? super.getPrice(city)  : 0f;

