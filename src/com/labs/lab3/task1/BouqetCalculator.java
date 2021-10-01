package com.labs.lab3.task1;

public class BouqetCalculator {
    /**
     * Расчитать стоимость всех букетов
     */
    public static void Calculate(Flower[][] bouqets){
        double result = 0;

        for (int i = 0; i < bouqets.length; i++) {
            Flower[] bouqet = bouqets[i];
            for (int j = 0; j < bouqet.length; j++) {
                result += bouqet[i].getPrice();
            }
        }

        System.out.println(String.format("Стоимость всех букетов: %.2f", result));
    }
}
