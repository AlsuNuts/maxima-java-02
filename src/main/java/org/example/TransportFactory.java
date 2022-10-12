package org.example;
/*
Описать класс TransportFactory с методом Transport getTransport(City city, int weight, int hours) который будет в зависимости от города,
веса и срока доставки конструировать нам транспортное средство по следующим правилам:

Название и стоимость — для самолета, корабля и грузовика различные константы, выберите из сами, задайте их в начале метода.

Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль. Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет.
В остальных случаях — грузовик.

Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.

Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.

Если вес кратен 500 и или скорость кратна 10, то округлять не нужно.
 */

public class TransportFactory {
    public Transport getTransport(City city, int weight, int hours){
        String planeName = "самолет";
        float planeCostOfKm = 58.9f;
        String shipName = "баржа";
        float shipCostOfKm = 12.7f;
        String truckName = "БЗНК"; //тем, кто любит гаражный панк-рок, рекомендую к прослушиванию Truckdrivers - Безумцы землю ногами крутят
        float truckCostOfKm = 13.4f;


        int transportSpeed = city.getDistanceKm()/hours; //скорость, необходимая лдля прибытия в срок
        int transportWeight = (weight % 500 != 0) ? (int) Math.ceil(weight/500) * 500 : weight;
        transportSpeed = (transportSpeed % 10 != 0) ? (int) Math.ceil(transportSpeed) * 10 : transportSpeed;

        if (transportSpeed<40 & city.isOnWater()){
            return new Ship(shipName, transportWeight, transportSpeed, shipCostOfKm);
        }
        if (transportSpeed>120 & city.hasAirport()){
            return new Plane(planeName, transportWeight, transportSpeed, planeCostOfKm);
        }
        return new Truck( truckName, transportWeight, transportSpeed, truckCostOfKm);
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
