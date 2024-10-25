package lesson_05;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; // объявление и инициализация пепеменной типа String

        String string1 = new String("Hello"); // Тоже создание новой строки

        System.out.println(string);

        //название метода с круглыми скобками - вызов метода
        System.out.println(string.length()); // количество символов в строке (длинна строки)

        // Метод позволяет перевести все символы в верхний регистр
        System.out.println(string.toUpperCase()); // переводим все символы строки в верхний регистр
        System.out.println(string);

        // String - иммутабельная (неизменяемая)
        // Если я хочу сохранить результат работы метода - я должен сохранить его в какую-то переменную
        String string2 = string.toUpperCase();
        System.out.println("string2: " + string2);
        System.out.println("string: " + string);

        // toLowerCase() - переводит все символы строки в нижний регистр
        string2 = string2.toLowerCase();
        System.out.println("string2: " + string2);

        System.out.println("==========================");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты склеивание / объединение / конкатенации строк
        //   Конкатенация строк
        String concatStr = str1 + str2 + str3 + "!!!";
        System.out.println(concatStr);

        String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat("???"); // str1 + str2 + str3 + "???"
        System.out.println(concatStr3);

        String concatStr4 = String.join(" ", str1, str3, "!!!");
        System.out.println("concatStr4: " + concatStr4);

        System.out.println("==========================0");

        // Приведение типов
        // Когда есть строка - знак плюс - знак конкатенации. И все операнды (участники операции) преобразуются к строке
        int a = 1; // "1"
        int b = 2;
        String string3 = "Hello";
        //     1 + 2 = 3 -> "3" + "hello" + (1 + 2)
        // Приоритет операций мы можем задавать скобками
        System.out.println(a + b + string3 + " = " + (a + b));

        System.out.println("=========================\n");

        String digits = "123456789";
        System.out.println(digits.length());
        String digits2 = "9876543210";

        char firstChar = digits.charAt(0); // Взять символ под индексом (номером) 0 из строки digits
        char firstChar2 = digits2.charAt(0); // Взять символ под индексом 0 из строки digits2
        System.out.println("first from digits: " + firstChar);
        System.out.println("first from digits2: " + firstChar2);

        int length = digits.length();
        // Независимо от фактической длины строки, индекс последнего элемента всегда равен длина минус 1
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("last from digits: " + lastChar);
        System.out.println(digits2.charAt(digits2.length() - 1)); // последний символ в строке digits2

        System.out.println("==============Substring=================");
        String subString = digits.substring(2); // Выделить подстроку начиная с индекса 2 до конца строки
        System.out.println("digits.substring(2): " + subString);
        System.out.println("digits: " + digits); // Начальная строка остаётся неизменной
        //                              (2, 7) -> 2,3,4,5,6
        subString = digits.substring(2, 7); // Взять подстроку от индекса 2 включительно до индекса 7 не включительно
        System.out.println("digits.substring(2, 7): " + subString);

        System.out.println("================Replace==============\n");
        String string4 = "OneTwoOneTwoThree";
        String replace = string4.replace("One", "Stop"); // Заменить все найденные строки "One" на "Stop"
        System.out.println("replace: " + replace);
        replace = string4.replaceFirst("One", "Stop"); //  Заменить первое найденное "One" на "Stop"
        System.out.println("replaceFirst: " + replace);


    }
}
