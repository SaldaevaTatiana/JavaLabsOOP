package com.labs.lab4.task1;

public class Cat extends Animal {
    /**
     * Расцветка кошки
     */
    private String color;

    /**
     * Конструктор
     * @param vegeterian
     * @param eats
     * @param noOfLegs
     * @param color
     */
    public Cat(boolean vegeterian, String eats, boolean noOfLegs, String color){
        super(vegeterian, eats, noOfLegs);
        this.color = color;
    }

    /**
     * Расширение базового метода
     */
    public void getAnimalInfo(){
        super.getAnimalInfo();
        System.out.println(String.format("имеет окрас %s", color));
    }
}
