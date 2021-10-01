package com.labs.lab3;

import com.labs.lab3.task1.*;
import com.labs.lab3.task2.*;

/**
 * Главный класс лабораторной работы #3
 */
public class Lab3 {
    /**
     * Задание 1. Стоимость проданных букетов
     */
    public void Task1(){
        System.out.println("[Задание #1]");

        Flower[][] bouqets = new Flower[][]{
          new Flower[] { new Rose(), new Rose(), new Lily() },
          new Flower[] { new Carnation(), new Rose(), new Chamomile(), new Lily(), new Lily() },
          new Flower[] { new Rose(), new Chamomile(), new Chamomile() },
        };

        BouqetCalculator.Calculate(bouqets);
        System.out.println("\n");
    }

    /**
     * Задание 2. Машины и двигатели
     */
    public void Task2(){
        System.out.println("[Задание #2]");

        Engine lorryEngine = new TruckEngine(660, "Volvo trucks");
        Car lorry = new Lorry("Volvo FH16", "Truck", 30000, lorryEngine, 7200);

        SportcarEngine sportcarEngine = new SportcarEngine(1001, "Bugatti", 4);
        Car sportcar = new Sportcar("Bugatti Veyron", "Sportcar", sportcarEngine, 1888);

        sportcar.printInfo();
        sportcar.start();
        sportcar.turnLeft();
        sportcar.stop();

        lorry.printInfo();
        lorry.start();
        lorry.turnRight();
        lorry.stop();

        System.out.println("\n");
    }
}
