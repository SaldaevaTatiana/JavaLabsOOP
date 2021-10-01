package com.labs.lab3.task2;

/**
 * Двигатель грузовика
 */
public class TruckEngine extends Engine {
    /**
     * Конструктор
     * @param power
     * @param manufacturer
     */
    public TruckEngine(double power, String manufacturer){
        this.power = power;
        this.manufacturer = manufacturer;
    }
}
