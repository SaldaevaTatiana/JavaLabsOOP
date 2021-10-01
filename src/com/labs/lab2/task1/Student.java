package com.labs.lab2.task1;

/**
 * Класс студента
 */
public class Student {
    /**
     * Имя
     */
    public String firstName;

    /**
     * Фамилия
     */
    public String lastName;

    /**
     * Группа
     */
    public String group;

    /**
     * Средний балл
     */
    public double averageMark;

    /**
     * Аспирант
     * @param firstName
     * @param lastName
     * @param group
     * @param averageMark
     */
    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    /**
     * Получить размер стипендии
     * @return
     */
    public double getScholarship() {
        if (averageMark == 5)
            return 100;

        return 80;
    }
}
