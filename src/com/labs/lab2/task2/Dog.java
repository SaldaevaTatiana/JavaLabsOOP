package com.labs.lab2.task2;

/**
 * Собака
 */
public class Dog extends Animal {
    /**
     * Конструктор
     *
     * @param food
     * @param location
     */
    public Dog(String food, String location) {
        super(food, location);
    }

    /**
     * Живоное ест
     */
    @Override
    public void eat(){
        System.out.println("Собака ест");
    }

    /**
     * Животное спит
     */
    @Override
    public void sleep(){
        System.out.println("Собака спит");
    }

    /**
     * Собака кусается
     */
    public void bite(){
        System.out.println("Собака кусается");
    }
}
