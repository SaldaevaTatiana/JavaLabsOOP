package com.labs.lab3.task2;

public class Sportcar extends Car {
    /**
     * Конструктор
     * @param model
     * @param carClass
     * @param engine
     * @param weight
     */
    public Sportcar(String model, String carClass, SportcarEngine engine, double weight){
        this.model = model;
        this.carClass = carClass;
        this.engine = engine;
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(String.format("Модель %s, класс %s, производитель двигателя: %s, мощность двигателя: %.2f, давление турбонаддува: %.2f, масса: %.2f",
                this.model, this.carClass, this.engine.manufacturer, this.engine.power, ((SportcarEngine)this.engine).turbochargingPressure, this.weight));
    }
}
