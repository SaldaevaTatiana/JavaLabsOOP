package com.labs.lab3.task2;

/**
 * Двигатель спорткара
 */
public class SportcarEngine extends Engine {
    /**
     * Давление турбонаддува в барах
     */
    public double turbochargingPressure;

    /**
     * Конструктор
     * @param power
     * @param manufacturer
     * @param turbochargingPressure
     */
    public SportcarEngine(double power, String manufacturer, double turbochargingPressure){
        this.power = power;
        this.manufacturer = manufacturer;
        this.turbochargingPressure = turbochargingPressure;
    }
}
