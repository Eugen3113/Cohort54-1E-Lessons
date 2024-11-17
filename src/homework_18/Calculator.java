package homework_18;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.11.2024
 */

/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции:
сложение,
вычитание,
умножение и
деление

Класс должен содержать:

Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
 */

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        System.out.println("double division");
        return a / b;
    }

    public static int divide(int a, int b) {
        System.out.println("int division");
        if (b == 0) {
            // Todo хорошего решения нет.
            return Integer.MAX_VALUE;
        }
        return a / b;
    }


}

