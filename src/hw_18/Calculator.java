package hw_18;

//Task 1
//Класс "Калькулятор"
//Создайте класс Calculator, который будет предоставлять
//
//базовые арифметические операции: сложение, вычитание, умножение и деление
//Класс должен содержать:
//
//Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
//

public class Calculator {

    // Метод для сложения
    public static double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return a / b;
    }


}