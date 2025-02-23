package hw_38_teacher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.02.2025
 */

/*
Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e

 */

public class Task3 {
    public static void main(String[] args) {
        String string = "AAAabcdefj ab,cdf,";                      // "abcdefj ab,cdf," это неповторяющийся символ "e"
        System.out.println(getFirstUniqueChar(string));             // "e"
        System.out.println("\nНе правильный вариант решения!");     //
        System.out.println(getFirstUniqueChar2(string));             // "e"
    }

    private static Character getFirstUniqueChar(String string) {        // string - входная строка символов в виде строки "abcdefj ab,cdf,"
        Set<Character> uniqueChars = new LinkedHashSet<>();             // уникальные символы входной строки "abcdefj ab,cdf,"
        Set<Character> repeatedChars = new HashSet<>();                 // повторяющиеся символы входной строки "abcdefj ab,cdf,"

        // Перебираем символы в строке
        for (char ch : string.toCharArray()) {                     // ch - текущий символ в строке string в виде char (символа)

            // Проверяем, присутствует ли текущий символ в сете повторов
            if (repeatedChars.contains(ch)) {                     // repeatedChars - повторяющиеся символы входной строки "abcdefj ab,cdf,"
                continue;                                        // если да, переходим к следующему символу
            }

            // 1. Проверяем, присутствует ли он в сете уникальных
            if (uniqueChars.contains(ch)) {                         // uniqueChars - уникальные символы входной строки "abcdefj ab,cdf,"
                uniqueChars.remove(ch);                            //2. если да, убираем символ из уникальных
                repeatedChars.add(ch);                              //3. добавляем в повторяющиеся
            } else {
                uniqueChars.add(ch);                                //4. если нет, добавляем в уникальные
            }
        }

        System.out.println("repeated chars: " + repeatedChars);       // repeatedChars - повторяющиеся символы входной строки "abcdefj ab,cdf,"
        System.out.println("unique chars: " + uniqueChars);           // uniqueChars - уникальные символы входной строки "abcdefj ab,cdf,"

        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();  // uniqueChars - уникальные символы входной строки "abcdefj ab,cdf,"

    }



    private static Character getFirstUniqueChar2(String string) {         // string - входная строка символов в виде строки "abcdefj ab,cdf,"
        // Это решение работает не правильно!

        Set<Character> uniqueChars = new LinkedHashSet<>();              // уникальные символы входной строки "abcdefj ab,cdf,"

        // string.toCharArray() - > char[] - из строки получить массив char
        for (char ch : string.toCharArray()) {                          // ch - текущий символ в строке string в виде char (символа)
            if (!uniqueChars.add(ch)) {                                 // uniqueChars - уникальные символы входной строки "abcdefj ab,cdf,"
                uniqueChars.remove(ch);                                 // убираем повторяющиеся символы из уникальных
            }
        }

        System.out.println(uniqueChars);                                // uniqueChars - уникальные символы входной строки "abcdefj ab,cdf,"

        /*
        1. Проверить не пустой ли вообще список.
        2. Как-то взять по другому первый элемент
         */


        // проверяем не пустой ли вообще список. Берём первый элемент списка и возвращаем его (если список не пустой) (при помощи next())
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();  // uniqueChars - уникальные символы входной строки "abcdefj ab,cdf,"
                                                                              //unique chars: [e, j,  ]
//        return new ArrayList<>(uniqueChars).get(0); // достучаться до элемента оп индексу, преобразовав set в list


    }
}
