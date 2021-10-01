package com.labs.lab2.task2;

/**
 * Лошадь
 */
public class Horse extends Animal {
    /**
     * Конструктор
     *
     * @param food
     * @param location
     */
    public Horse(String food, String location) {
        super(food, location);
    }

    /**
     * Живоное ест
     */
    @Override
    public void eat(){
        System.out.println("Лошадь ест");
    }

    /**
     * Животное спит
     */
    @Override
    public void sleep(){
        System.out.println("Лошадь спит");
    }

    /**
     * Лошадь бежит
     */
    public void galop(){
        System.out.println("Лошадь скачет");
    }
}
