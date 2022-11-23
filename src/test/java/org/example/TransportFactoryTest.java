package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TransportFactoryTest {
    City kazan = new City("Казань", 800, true, true);
    City syzran = new City("Сызрань", 900, false, true);
    City barnaul = new City("Барнаул", 3600, true, false);


    @Test
    public void shouldBeTransportName(){
        Assert.assertEquals("грузовик", TransportFactory.getTransport(barnaul, 2199, 350).getName());
        Assert.assertEquals("самолет", TransportFactory.getTransport(barnaul, 2199, 24).getName());
        Assert.assertEquals("баржа", TransportFactory.getTransport(syzran, 2199,350).getName());
        Assert.assertEquals("грузовик", TransportFactory.getTransport(syzran, 2199,24).getName());
    }
    @Test
    public void shouldBeTransportNameIfSpeedLimitAndIsWaterOrHasAirport(){ //если есть ограничение скорости и есть вода/аэропорт
        Assert.assertEquals("баржа", TransportFactory.getTransport(kazan, 2199, 350).getName());
        Assert.assertEquals("самолет", TransportFactory.getTransport(kazan, 2199, 2).getName());
        Assert.assertEquals("грузовик", TransportFactory.getTransport(kazan, 2199, 12).getName());
    }
    @Test
    public void shouldBeTransportRoundingCapacity(){
        Assert.assertEquals(2500, TransportFactory.getTransport(kazan, 2199, 350).getCapacity());
        Assert.assertEquals(500, TransportFactory.getTransport(kazan, 499, 350).getCapacity());
        Assert.assertEquals(3500, TransportFactory.getTransport(kazan, 3126, 350).getCapacity());
        Assert.assertEquals(19000, TransportFactory.getTransport(barnaul, 18745, 350).getCapacity());
    }
    @Test
    public void shouldBeTransportSpeed(){
        Assert.assertEquals(10, TransportFactory.getTransport(kazan, 2199, 350).getSpeed());
        Assert.assertEquals(70, TransportFactory.getTransport(kazan, 2199, 12).getSpeed());
        Assert.assertEquals(400, TransportFactory.getTransport(kazan, 2199, 2).getSpeed());
        Assert.assertEquals(30, TransportFactory.getTransport(syzran, 1500, 36).getSpeed());
        Assert.assertEquals(80, TransportFactory.getTransport(syzran, 1500, 12).getSpeed());
    }
    @Test
    public void shouldBeTransportClass(){
        Assert.assertEquals(Ship.class, TransportFactory.getTransport(kazan, 2199, 350).getClass());
        Assert.assertEquals(Plane.class, TransportFactory.getTransport(barnaul, 2199, 24).getClass());
        Assert.assertEquals(Truck.class, TransportFactory.getTransport(syzran, 2199,24).getClass());
    }
    @Test (expected = ArithmeticException.class)
    public void shouldBeZeroHours(){
        Assert.assertEquals(0, TransportFactory.getTransport(syzran, 2199,0).getCapacity());
    }

}
/*
        TransportFactory factory = new TransportFactory();

        System.out.println(factory.getTransport(tokio, 2199, 350));

 */
