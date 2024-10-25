// Eugen Grünwald
// Cohort 54.1
// homework_05


package homework;

import java.util.Scanner;

public class Homework_05 {
    public static void main(String[] args) {

        System.out.println("Task 1 =======================");

        /*
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();

        System.out.println(name);
        int length = name.length();

        System.out.println("Количество символов в имени пользователя: " + length);


        char firstChar = name.charAt(0);
        System.out.println("Первый символ имени: " + firstChar);
        System.out.println("Первый символ: '" + firstChar + "' (код: " + (int) firstChar + ")"); // Пример,имя женя.Первый символ: 'ж' (код: 1078)



        char lastChar = name.charAt(name.length() - 1);
        System.out.println("Последний символ имени: " + lastChar); // Последний символ имени: я
        System.out.println("Последний символ: '" + lastChar + "' (код: " + (int) lastChar + ")"); // Последний символ: 'я' (код: 1103)


        /*
             *Решение Учителя*
             *
             Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        int length = name.length();
        System.out.println("количество символов в имени пользователя: " + length);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(length -1);

        System.out.println("Код первого символа: " + (int) firstChar);
        System.out.println("Код последнего символа: " + (int) lastChar);


         */

        System.out.println("Task 2 =======================");

        /*
        Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
         */

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String concatStr1 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println(concatStr1);
        int lenght1 = concatStr1.length();
        System.out.println("Длинна строки: " + lenght1);

        String concatStr2 = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println("concatStr2: " + concatStr2);

        /*
        **Решение Учителя*
        *
        *   String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language";

        String space = " ";

        String concatStr = String.join(space, str, str1, str2, str3, str4);
        System.out.println("concatStr1: " + concatStr + "; длина строки: " + concatStr.length());

        concatStr = str.concat(space)
                .concat(str1).concat(space)
                .concat(str2).concat(space)
                .concat(str3).concat(space)
                .concat(str4);

        System.out.println("concatStr2: " + concatStr + "; длина строки: " + concatStr.length());

        String result = concatStr.replace("powerful", "super");
        System.out.println("result: " + result);


        // Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        boolean isContains = result.contains("age");
        System.out.println("isContains: " + isContains);
        *
         */

        System.out.println("Task 3 =======================");


        /*
        **Решение Учителя*
        *
        * Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".


        public class Task3 {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("ввести строку чётной длины:");
                String input = scanner.nextLine();

                int index = input.length() / 2 - 1;

                // Opt1 вариант
                System.out.println("" + input.charAt(index) + input.charAt(index + 1)); // Ставим "" чтобы int перевести в строку (string).

                // Opt2 вариант
                String substring = input.substring(index, index + 2); // Для строки "string" результат будет "ri".Ставим +2,чтобы вывелась "i"
                * если оставим (index, index + 1)  выведится только "r"
                System.out.println(substring);
        *
         */

    }
}
