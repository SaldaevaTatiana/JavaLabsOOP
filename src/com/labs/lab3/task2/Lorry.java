package com.labs.lab3.task2;

public class Lorry extends Car {
    public double liftingCapacity;

    /**
     * Конструктор
     * @param model
     * @param carClass
     * @param liftingCapacity
     * @param engine
     * @param weight
     */
    public Lorry(String model, String carClass, double liftingCapacity, Engine engine, double weight){
        this.model = model;
        this.carClass = carClass;
        this.liftingCapacity = liftingCapacity;
        this.engine = engine;
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(String.format("Модель %s, класс %s, грузоподъемность: %.2f, производитель двигателя: %s, мощность дыигателя: %.2f, масса: %.2f",
                this.model, this.carClass, this.liftingCapacity, this.engine.manufacturer, this.engine.power, this.weight));
    }
}
