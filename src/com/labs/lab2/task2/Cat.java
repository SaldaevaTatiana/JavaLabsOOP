package com.labs.lab2.task2;

/**
 * Кошка
 */
public class Cat extends Animal {

    /**
     * Конструктор
     *
     * @param food
     * @param location
     */
    public Cat(String food, String location) {
        super(food, location);
    }

    /**
     * Живоное ест
     */
    @Override
    public void eat(){
        System.out.println("Кошка ест");
    }

    /**
     * Животное спит
     */
    @Override
    public void sleep(){
        System.out.println("Кошка спит");
    }

    /**
     * Кошка царапается
     */
    public void scratch(){
        System.out.println("Кошка царапается");
    }
}
