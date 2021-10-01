package com.labs.lab2.task3;

import java.util.Objects;
import java.util.Optional;

/**
 * Класс телефона
 */
public class Phone {
    /**
     * Модель телефона
     */
    public String model;

    /**
     * Вес
     */
    public double weight;

    /**
     * Номер
     */
    private String number;

    /**
     * Конструктор с 3 параметрами
     * @param number
     * @param model
     * @param weight
     */
    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone() { }

    /**
     * Принять звонок
     * @param callerName
     */
    public void receiveCall(String callerName){
        System.out.println(String.format("Звонит %s", callerName));
    }

    /**
     * Принять звонок с отображением номера звонившего
     * @param callerName
     */
    public void receiveCall(String callerName, String callerNumber){
        System.out.println(String.format("Звонит %s. Номер: %s", callerName, callerNumber));
    }

    /**
     * Получить номер телефона
     * @return
     */
    public String getNumber(){
        return Optional.ofNullable(this.number).orElse("не указан");
    }

    /**
     * Отправить сообщение
     * @param numbers
     * @return
     */
    public void sendMessage(String...numbers){
        System.out.print("На номера ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(String.format("%s ", numbers[i]));
        }

        System.out.print("было отправлено сообщение");
    }
}
