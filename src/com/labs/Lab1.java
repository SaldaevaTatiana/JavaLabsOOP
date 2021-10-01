package com.labs;

import java.util.Scanner;

/**
 * Класс с задания лабораторной работы #1
 */
public class Lab1 {

    /**
     * Считыватель данных, введенных пользователем из консоли
     */
    private Scanner scanner;

    /**
     * Конструктор класса с лабораторной работой #1
     */
    public Lab1() {
        // Инициализация считывателя ввода
        scanner = new Scanner(System.in);
    }

    /**
     * Метод для запуска всех задач лабораторной работы
     * (Расскоментировать нужное)
     */
    public void Start(){
        task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
    }

    /**
     * Задание #1
     * Последняя цифра числа
     */
    private void task1(){
        System.out.println("[Задание #1] Последняя цифра числа");
        System.out.print("Введите число:");
        String number = scanner.nextLine();
        System.out.println(String.format("Результат: %s", number.substring(number.length() - 1)));
        System.out.println("\n");
    }

    /**
     * Задание #2
     * Сумма цифр трехзначного числа
     */
    private void task2(){
        System.out.println("[Задание #2] Сумма цифр трехзначного числа");
        System.out.print("Введите трехзначное число: ");
        String number = scanner.nextLine();
        // Integer.parseInt() принимает на вход строку, но из числа мы получаем символы (Char).
        // Прибавляя пустую строку мы превращаем наш единственный char в string (набор char)
        int result = Integer.parseInt(number.charAt(0) + "")
                + Integer.parseInt(number.charAt(1) + "")
                + Integer.parseInt(number.charAt(2) + "");

        System.out.println(String.format("Результат: %d", result));
        System.out.println("\n");
    }

    /**
     * Задание #3
     * Вывод полученного числа по условию
     */
    private void task3(){
        System.out.println("[Задание #3] Вывод полученного числа по условию");
        System.out.print("Введите число: ");
        String number = scanner.nextLine();
        int intNumber = Integer.parseInt(number);
        if (intNumber > 0)
            intNumber++;

        System.out.println(String.format("Результат: %d", intNumber));
        System.out.println("\n");
    }

    /**
     * Задание #4
     * Операция над числом в зависимости от условий
     */
    private void task4(){
        System.out.println("[Задание #4] Операция над числом в зависимости от условий");
        System.out.print("Введите число: ");
        String number = scanner.nextLine();
        int intNumber = Integer.parseInt(number);
        if (intNumber > 0)
            intNumber++;
        else if (intNumber < 0)
            intNumber = intNumber - 2;
        else
            intNumber = 10;

        System.out.println(String.format("Результат: %d", intNumber));
        System.out.println("\n");
    }

    /**
     * Задание #5
     * Наименьшее число
     */
    private void task5(){
        System.out.println("[Задание #5] Наименьшее число");
        System.out.print("Введите числа разделяя пробелами: ");
        String numbers = scanner.nextLine();
        String[] numbersStrings = numbers.split(" ");

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbersStrings.length; i++) {
            int current = Integer.parseInt(numbersStrings[i]);
            if (min > current)
                min = current;
        }

        System.out.println(String.format("Результат: %d", min));
        System.out.println("\n");
    }

    /**
     * Задание #6
     * Описание числа
     */
    private void task6(){
        System.out.println("[Задание #6] Описание числа");
        System.out.print("Введите число: ");
        String number = scanner.nextLine();
        int intNumber = Integer.parseInt(number);
        String result = "";

        // Если число не имеет остатка после деления на 2, то оно - целое
        boolean isEven = intNumber % 2 == 0;
        // Определение положительное число или отрицательное
        boolean isPositive = intNumber > 0;
        // Число равно 0
        boolean isZero = intNumber == 0;
        if (isZero)
            result = "Нулевое число";
        else if (isEven && isPositive)
            result = "Положительное четное число";
        else if (isEven && !isPositive)
            result = "Отрицательное четное число";
        else if (!isEven && isPositive)
            result = "Положительное нечетное число";
        else if (!isEven && !isPositive)
            result = "Отрицательное нечетное число";

        System.out.println(String.format("Результат: %s - %s", number, result));
        System.out.println("\n");
    }

    /**
     * Задание #7
     * Стоимость междугороднего разговора
     */
    private void task7(){
        System.out.println("[Задание #7] Стоимость междугороднего разговора");
        System.out.print("Введите код города: ");
        String code = scanner.nextLine();

        double result = 0f;
        switch (code){
            case "905":
                result = 4.15 * 10;
                break;
            case "194":
                result = 1.98 * 10;
                break;
            case "491":
                result = 2.69 * 10;
                break;
            case "800":
                result = 5 * 10;
                break;
        }

        // Выводим результат с форматированием - 2 числа после запятой
        System.out.println(String.format("Результат: %.2f", result));
        System.out.println("\n");
    }

    /**
     * Задание #8
     * Операции над массивом
     */
    private void task8(){
        System.out.println("[Задание #8] Операции над массивом");
        System.out.print("Операции над массивом");

        int[] numbers = new int[] { 1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2 };
        StringBuilder inputArray = new StringBuilder();

        // Результирующие значения
        // Максимальное значение
        int max = Integer.MIN_VALUE;
        // Сумма положительных
        int positiveSum = 0;
        // Сумма отрицательных четных
        int negativeEvenSum = 0;
        // Количество положительных
        int positiveCount = 0;
        // Для среднего арифметического отрицательных элементов
        int allNegativeSum = 0;
        int negativeCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            inputArray.append(current).append(" ");

            if (max < current)
                max = current;

            if (current > 0) {
                positiveSum += current;
                positiveCount++;
            }

            if (current < 0){
                negativeCount++;
                allNegativeSum += current;

                if (current % 2 == 0)
                    negativeEvenSum += current;
            }
        }

        System.out.println(String.format("Исходный массив: %s", inputArray.toString()));
        System.out.println(String.format("Максимальное число: %d", max));
        System.out.println(String.format("Сумма положительных элементов: %d", positiveSum));
        System.out.println(String.format("Сумма отрицательных четных элементов: %d", negativeEvenSum));
        System.out.println(String.format("Количество положительных элементов: %d", positiveCount));
        System.out.println(String.format("Среднее арифметическое отрицательных элементов: %.2f", allNegativeSum/negativeCount * 1f));
        System.out.println("\n");
    }

    /**
     * Задание #9
     * Реверс массива
     */
    private void task9(){
        System.out.println("[Задание #9] Реверс массива");

        Integer[] numbers = new Integer[] { 15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52 };
        StringBuilder inputArray = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            inputArray.append(numbers[i].toString()).append(" ");
        }

        StringBuilder result = new StringBuilder();
        // Обратный цикл, с последнего элемента
        for (int i = numbers.length - 1; i >= 0; i--) {
            result.append(numbers[i].toString()).append(" ");
        }

        System.out.println(String.format("Исходный массив: %s", inputArray.toString()));
        System.out.println(String.format("Результат: %s", result.toString()));
        System.out.println("\n");
    }

    /**
     * Задание #10
     * Перемещение нулейв конец массива
     */
    private void task10(){
        System.out.println("[Задание #10] Перемещение нулей в конец массива");

        Integer[] numbers = new Integer[] { 15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52 };
        StringBuilder inputArray = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int resultIdx = 0;

        // Сначала записываем все элементы массива без нулей
        for (int i = 0; i < numbers.length; i++) {
            inputArray.append(numbers[i].toString()).append(" ");

            if (numbers[i] == 0)
                continue;

            result.append(numbers[i].toString()).append(" ");
            resultIdx++;
        }

        // Затем делаем добор нулей в конце
        for (int i = resultIdx; i < numbers.length; i++) {
            result.append("0").append(" ");
        }

        System.out.println(String.format("Исходный массив: %s ", inputArray.toString()));
        System.out.println(String.format("Результат: %s", result.toString()));
        System.out.println("\n");
    }
}
