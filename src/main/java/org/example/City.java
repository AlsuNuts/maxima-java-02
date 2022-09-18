package org.example;

public class City {

    private String name;    //название города
    private int distanceKm;  //расстояние
    private boolean hasAirport;
    private boolean isOnWater;



    public City(String name){
        this(name, false, true,0); // (!)вот тут не нравится, что дистанция 0
    }
    public City(String name, boolean hasAirport, boolean isOnWater, int distanceKm) {
        this.name = name;
        this.hasAirport = hasAirport;
        this.isOnWater = isOnWater;
        this.distanceKm = distanceKm;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDistanceKm() {
        return distanceKm;
    }
    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }
    public boolean isHasAirport() {
        return hasAirport;
    }

    public void setHasAirport(boolean hasAirport) {
        this.hasAirport = hasAirport;
    }

    public boolean isOnWater() {
        return isOnWater;
    }

    public void setOnWater(boolean onWater) {
        isOnWater = onWater;
    }
}
