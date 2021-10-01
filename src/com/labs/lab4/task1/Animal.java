package com.labs.lab4.task1;

/**
 * Абстрактный класс животного
 */
public abstract class Animal {
    /**
     * Является ли животное травоядным
     */
    private boolean vegeterian;

    /**
     * Чем животное питается
     */
    private String eats;

    /**
     * Признак остутствия ног
     */
    private boolean noOfLegs;

    /**
     * Конструктор
     * @param vegeterian
     * @param eats
     * @param noOfLegs
     */
    public Animal(boolean vegeterian, String eats, boolean noOfLegs){
        this.vegeterian = vegeterian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    /**
     * Характеристика животного
     */
    public void getAnimalInfo(){
        System.out.print(String.format("Животное ест %s, признак вегетарианства: %b, ", eats, vegeterian));
    }
}
