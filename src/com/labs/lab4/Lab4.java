package com.labs.lab4;

import com.labs.lab4.task1.Cat;
import com.labs.lab4.task2.*;
import com.labs.lab4.task3.Donkey;
import com.labs.lab4.task3.Horse;
import com.labs.lab4.task3.Pegasus;
import com.labs.lab4.task3.Zebra;
import com.labs.lab4.task4.*;
import com.labs.lab4.task5.*;

/**
 * Класс лабораторной работы #4
 */
public class Lab4 {
    /**
     * Задание 1. Животные
     */
    public void Task1(){
        System.out.println("[Задание #1]");

        Cat cat = new Cat(true, "Вискас", false, "белый");
        cat.getAnimalInfo();

        System.out.println("\n");
    }

    /**
     * Задание 2. Здания
     */
    public void Task2(){
        System.out.println("[Задание #2]");

        Building[] buildings = new Building[]{
            new House(),
            new Library(),
            new School(),
            new Supermarket()
        };

        for (int i = 0; i < buildings.length; i++) {
            buildings[i].getInfo();
        }

        System.out.println("\n");
    }

    /**
     * Задание 3. Разновидность лошадей
     */
    public void Task3(){
        System.out.println("[Задание #3]");

        Horse[] horses = new Horse[]{
            new Donkey(),
            new Pegasus(),
            new Zebra()
        };

        for (int i = 0; i < horses.length; i++) {
            horses[i].getInfo();
        }

        System.out.println("\n");
    }

    /**
     * Задание 4. Разновидность еды
     */
    public void Task4(){
        System.out.println("[Задание #4]");

        Food[] dishes = new Food[]{
            new MainDish(),
            new Salad(),
            new Soup(),
            new Starter()
        };

        for (int i = 0; i < dishes.length; i++) {
            dishes[i].getInfo();
        }

        System.out.println("\n");
    }

    /**
     * Задание 5. Разновидность обуви
     */
    public void Task5(){
        System.out.println("[Задание #5]");

        FootWear[] footWears = new FootWear[]{
            new Boots(),
            new HighShoes(),
            new Sandals(),
            new Shoes(),
            new Slippers(),
            new Trainers()
        };

        for (int i = 0; i < footWears.length; i++) {
            footWears[i].getInfo();
        }

        System.out.println("\n");
    }
}
