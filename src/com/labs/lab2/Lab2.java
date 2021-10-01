package com.labs.lab2;

import com.labs.lab2.task1.Aspirant;
import com.labs.lab2.task1.Student;
import com.labs.lab2.task2.Animal;
import com.labs.lab2.task2.Cat;
import com.labs.lab2.task2.Dog;
import com.labs.lab2.task2.Horse;
import com.labs.lab2.task3.Phone;

import java.util.Optional;

public class Lab2 {
    /**
     * Задание #1. Студенты и аспиранты
     */
    public void Task1(){
        System.out.println("[Задание #1]");
        Student[] students = new Student[] {
                new Student("Антон", "Николаев", "С102", 4.5),
                new Aspirant("Алия", "Ахметшина", "А403", 5),
                new Student("Михаил", "Гранитов", "С202", 5),
                new Aspirant("Даниил", "Озеров", "А402", 4.5),
                new Student("Дарья", "Голубева", "С204", 4)
        };

        System.out.println("Результат: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(String.format("Студент %s %s группы %s со средним баллом %.2f получает стипендию %.2f",
                    students[i].lastName, students[i].firstName, students[i].group, students[i].averageMark, students[i].getScholarship()));
        }

        System.out.println("\n");
    }

    /**
     * Задание 2. Животные на приеме
     */
    public void Task2(){
        System.out.println("[Задание #2]");

        Animal[] animals = new Animal[] {
                new Cat("Вискас", "Клин"),
                new Dog("Чаппи", "Нижнее Бутово"),
                new Horse("Пырей", "Ново-Огарево"),
                new Dog("Мясо", "Лужники"),
                new Cat("Рыба", "Люберцы")
        };

        System.out.println("Результат: ");
        for (int i = 0; i < animals.length; i++) {
            String animalName = "Животное";

            if (animals[i] instanceof Cat){
                animalName = "Кошка";
            } else if (animals[i] instanceof Dog){
                animalName = "Собака";
            } else if (animals[i] instanceof Horse){
                animalName = "Лошадь";
            }

            System.out.println(String.format("%s из %s, основной едой которой является %s пришла на прием.",
                    animalName, animals[i].location, animals[i].food));
        }

        System.out.println("\n");
    }

    /**
     * Задание 3. Телефон
     */
    public void Task3(){
        System.out.println("[Задание #3]");

        Phone[] phones = new Phone[] {
            new Phone(),
            new Phone("88005553535", "Apple iPhone 13"),
            new Phone("84002003344", "Samsung Galaxy A40", 240)
        };

        System.out.println("Телефоны: ");
        for (int i = 0; i < phones.length; i++) {
            System.out.println(String.format("Модель: %s, номер: %s, масса: %s",
                    Optional.ofNullable(phones[i].model).orElse("не указан"),
                    phones[i].getNumber(),
                    phones[i].weight == 0 ? "не указана" : Double.toString(phones[i].weight)));
        }
        System.out.println();

        phones[1].receiveCall("Игорь");
        phones[2].receiveCall("Антонина", "88005553535");

        System.out.println(String.format("Ваш номер телефона: %s", phones[0].getNumber()));

        phones[2].sendMessage("8800555353", "84002003344");

        System.out.println("\n");
    }
}
