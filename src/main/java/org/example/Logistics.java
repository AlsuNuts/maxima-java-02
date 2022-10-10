package org.example;
/*
Описать класс Logistics - бизнес логику нашей логистики, при создании которого мы будем передавать ему свойство vehicles,
содержащее некоторое количество объектов класса Transport.

Описать методы Transport getShipping(City city, int weight, int hours) - найти самое оптимальное по стоимости доставки транспортное средство.

Необходимо учесть грузоподъемность и необходимость доставки в указанный срок,
для определения возможности перевозки определенным транспортом описать метод boolean isShippingAvailable()

В классе Logistics учесть состояние транспортного средства при расчете грузоперевозок.
 */

public class Logistics {


    private Transport [] vehicles;


    public Logistics(Transport ... vehicles) {

        this.vehicles = vehicles;
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Transport[] vehicles) {
        this.vehicles = vehicles;
    }

    public Transport getShipping(City city, int weight, int hours) {

        Transport profitTransport = null;

        for (Transport vehicle : vehicles) { //(int i = 0; i < vehicles().length(); i++)
            if (isShippingAvailable(city, vehicle, weight, hours)) {
                if (profitTransport == null ){
                    profitTransport = vehicle;
                }
                else if (profitTransport.getCostOfKm() > vehicle.getCostOfKm() ) { //хотела избежать else if конструкции, но мне так идея подсказала
                    profitTransport = vehicle;
                }
            }
        }
        return profitTransport;
    }
    public boolean isShippingAvailable(City city, Transport transport, int weight, int hours) {
        return !transport.isRepairing() & (transport.getCapacity() >= weight) & (city.getDistanceKm() / transport.getSpeed() <= hours) & transport.getCostOfKm() * city.getDistanceKm() != 0;
    }

}

/*
            for (int i = 0; i < vehicles().length(); i++) {

            if (weight > transport.getCapacity()) { //если груз больше грузоподъемности
                break;
            }
            if (hours > (city.getDistanceKm() / getSpeed())) { //если не укладывается по времени
                break;
            }
            if (!isRepairing()) { //если машина в ремонте
                break;
            }
            if (getPrice(city) < profit | getPrice(city) != 0) { //если стоимость выгодная
                profit = vehicle;

            }
        }


        return profit;
 */


