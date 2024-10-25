package lesson_05;


import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {

        // Подготовка программы к чтению данных от пользователя
        Scanner scanner = new Scanner(System.in); // сканер для общения с пользователем

        // Спросить имя у пользователя
        System.out.println("Введи ваше имя:");
        String name = scanner.nextLine(); // пользователь вводит своё имя или что-то другое

        System.out.println(name + 1);

        // Спросить возврат
        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();
        // Обнулить сканер / скушать хвост строки
        scanner.nextLine();
        System.out.println(age + 1);

        // Введите кол-во детей
        System.out.println("Введите кол-во детей:");
        int children = scanner.nextInt();
        scanner.nextLine();
        System.out.println(children);

        // Мы можем получить double
        System.out.println("Введите double: ");
        double doubleVar = scanner.nextDouble();
        System.out.println(doubleVar);



    }
}
