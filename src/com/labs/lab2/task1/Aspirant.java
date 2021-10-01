package com.labs.lab2.task1;

/**
 * Класс аспиранта, наследуемый от класса Студент
 */
public class Aspirant extends Student {
    /**
     * Конструктор
     * @param firstName
     * @param lastName
     * @param group
     * @param averageMark
     */
    public Aspirant(String firstName, String lastName, String group, double averageMark){
        super(firstName, lastName, group, averageMark);
    }

    /**
     * Получить размер стипендии
     * @return
     */
    @Override
    public double getScholarship() {
        if (averageMark == 5)
            return 200;

        return 180;
    }
}
