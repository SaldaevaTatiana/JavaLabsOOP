package com.labs.lab2.task2;

/**
 * Базовый класс Животное
 */
public class Animal {
    /**
     * Чем питается животное
     */
    public String food;

    /**
     * Город
     */
    public String location;

    /**
     * Конструктор
     * @param food
     * @param location
     */
    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    /**
     * Подать голос
     * @param animal
     */
    public void makeNoise(Animal animal){
        String result = "Животное издало звук";

        if (animal instanceof Cat){
            result = "Кошка мякнула";
        } else if (animal instanceof Dog){
            result = "Собака полаяла";
        } else if (animal instanceof Horse){
            result = "Лошадь поржала";
        }

        System.out.println(result);
    }

    /**
     * Живоное ест
     */
    public void eat(){
        System.out.println("Животное ест");
    }

    /**
     * Животное спит
     */
    public void sleep(){
        System.out.println("Животное спит");
    }
}
