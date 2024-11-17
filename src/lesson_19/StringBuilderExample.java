package lesson_19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.11.2024
 */

public class StringBuilderExample {
    public static void main(String[] args) {
        // Java is -> Java is -> Java is the -> Java is the  -> Java is the best
        String str = "Java " + "is" + " " + "the" + " " + "best";

        /*
        StringBuilder - это специальный класс, предназначенный для эффективного создания и модификации изменяемых последовательностей символов
        В отличие от класса String, объекты StringBuilder могут изменяться без создания новых объектов в памяти, что повышает производительность
        при частых операциях со строками
         */

        // Конструктор перегружен. Может быть пустым, может принимать String
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Hello");

        // Метод для добавления в конец строки (приклеить справа) / аналог конкатенации
        sb1.append(" ");
        sb1.append("World").append("!");

        // Получить строковое представление (String)
        String string = sb1.toString();
        System.out.println(string);

        // Вставить символы в указанную позицию                     // insert - вставить
        sb = new StringBuilder("Hello World");
        // в какую позицию вставлять, что вставлять
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());
        // "beautiful " вставить в середину строки в 6 индекс

        /*
        String s = "Hello World";
        String s1 = s.substring(0, 6);
        String s2 = s.substring(6);
        System.out.println(s1);
        System.out.println(s2);
        String res = s1 + "beautiful " + s2;
        System.out.println(res);
         */

        // Заменить подстроку (определяется индексами) на указанное значение          // replace - заменить
        sb = new StringBuilder("Hello World!");
        sb.replace(6, 11, "Java"); // верхняя граница не включается
        System.out.println(sb.toString());      // Hello Java!

        // Удалить подстроку в диапазоне индексов (с 5 по 11)               // delete - удалить
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());       // Hello!

        // Реверс - Разворачивает последовательность символов     // reverse - разворачивает
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());             // !dlroW olleH

        // Количество символов - длина                            // length() - длинна (Количество символов)
        System.out.println("sb.length(): " + sb.length() );

        // Получить символ по индексу                              // charAt() - Получить символ по индексу
        char ch = sb.charAt(3);
        System.out.println(ch);                       // r

        // Получить подстроку по индексу / индексам               // substring- Получить подстроку по индексу / индексам
        sb = new StringBuilder("Hello World!");
        String subString = sb.substring(1);  // от индекса до конца строки
        System.out.println(subString);            //  ello World!

        subString = sb.substring(6, 9); // от start до end (верхняя граница не включительно)
        System.out.println(subString);   // Wor

        // Измењять размер последовательности символов
        sb = new StringBuilder("Hello");
        System.out.println(sb.length());  // 5
        sb.setLength(10);   // увеличиваем строку на 10 , она будет заполнена char с кодом 0
        // Если увеличиваем строку, она будет заполнена char с кодом 0
        System.out.println("setLength(10): " + sb.toString());   // setLength(10): Hello00000

        char ch1 = sb.charAt(8);
        System.out.println("код символа: sb.charAt(8): " + (int) ch1) ;  // код символа: sb.charAt(8): 0
                                                                        // (приводим к int чтобы получить десятичный код)
        sb.setLength(3);                                         // setLength(3)- уменьшение длинны
        System.out.println("setLength(3): " + sb.toString());    // setLength(3): Hel

        System.out.println("\n================\n");

        String example = String.join(" ", "Java", "is", "the", "best");  // join - добавляет тут пробел между словами.
        System.out.println(example);                  // Java is the best
        String[] strings = example.split(" ");  // split - разделитель
        System.out.println(Arrays.toString(strings)); // [Java, is, the, best]


        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)
        Привет Джава разработчикам -> ПДР
        Использовать StringBuilder
         */

        String result = pharseString();
        System.out.println(result);


    }

    private static String pharseString() {
        /*
        1. Запросить у пользователя строку
        2. Разбить строку на массив слов
        3. Перебрать все слова в цикле
        4. Из каждого слова взять первую букву, приклеить ее к результату
        5. Когда все слова перебрали - получить строку, привести ее к верхнему регистру -> вернуть
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из нескольких слов");

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        // String result = "";

        String[] words = input.split(" ");


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            sb.append(word.charAt(0));
            // result = result + word.charAt(0);
        }

        return sb.toString().toUpperCase();
    }
}














