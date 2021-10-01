package com.labs.lab3.task2;

/**
 * Абстрактный класс машины
 */
public abstract class Car {
    /**
     * Мотор
     */
    public Engine engine;

    /**
     * Марка
     */
    public String model;

    /**
     * Класс
     */
    public String carClass;

    /**
     * Вес
     */
    public double weight;

    /**
     * Абстрактный метод "Старт"
     */
    public abstract void start();

    /**
     * Абстрактный метод "Стоп"
     */
    public abstract void stop();

    /**
     * Вывод полной информации об автомобиле и моторе
     */
    public abstract void printInfo();

    /**
     * Метод поворота налево
     */
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    /**
     * Метод поворота направо
     */
    public void turnRight(){
        System.out.println("Поворот направо");
    }
}
