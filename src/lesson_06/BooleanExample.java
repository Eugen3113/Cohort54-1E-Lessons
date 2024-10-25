package lesson_06;

import java.util.Random;

/*
 * {@code @date} 26.09.2024
 */

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true; // истина / правда
        bol1 = false; // ложь / не правда

        int x = 10;
        int y = 5;

        // Сравнение на равенство "=="
        boolean b1 = (x == y); // X равен Y -> 10 равно 5 -> false
        System.out.println(x + " == " + y + " -> " + b1); // false
        // Ctrl + D копировать
        // Ctrl + Y удалять

        // Сравнение на не равенство "!="
        b1 = x != y; // X не равно Y -> 10 не равно 5 -> true
        System.out.println(x + " != " + y + " -> " + b1); // true

        y = 10;
        // Больше ">"
        b1 = x > y; // X больше Y -> 10 больше 10 -> false
        System.out.println(x + " > " + y + " -> " + b1); // false

        // Больше или равно ">="
        b1 = x >= y; // X больше или равно Y -> 10 больше или равно 10 -> true
        System.out.println(x + " >= " + y + " -> " + b1); // false

        // Меньше "<"
        b1 = x < y; // X меньше Y -> 10 меньше 10 -> false
        System.out.println(x + " < " + y + " -> " + b1);

        // Меньше или равно "<="
        b1 = x <= y; // X меньше или равно Y -> 10 меньше или равно 10 -> true
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the best"; // Содержит ли эта строка подстроку "Java"
        boolean contains = str.contains("Java");
        // Экранирование символа. Сказать компилятору, что этот символ не воспринимать как  спец.символ \"  \"
        System.out.println("str.contains(\"Java\"): " + contains);

        // indexOf
        int index = str.indexOf("the"); // ищет индекс начала первого вхождения подстроки в строку. Если нет вхождения - мы получим -1
        System.out.println("Индекс вхождения: " + index);
        contains = index != -1; // Если индекс не равен -1, то вхождение найдено. Contains будет true. Иначе false
        contains = index >= 0; // Если индекс не равен -1, то вхождение найдено. Contains будет true. Иначе false
        System.out.println("contains: " + contains);

        // lastIndexOf
        // тоже ищет вхождение подстроки в строку. Но ищет последнее вхождение.
        index = str.lastIndexOf("the");
        System.out.println("Индекс последнего вхождения: " + index);


        System.out.println("\n =============== Логические операции =============== ");

        // Логическое НЕ (NOT) - отрицание "!"
        // Меняет значение типа boolean на противоположное
        boolean b2 = !false; // получим значение true
        System.out.println("!false: " + !false);

        b2 = !(4 != 5); // !true -> false
        System.out.println("!(4 != 5): " + b2);

        // Составные логические операции - объединение двух условий
        /*
        Логическое И "&"
        Используется когда нужно, чтобы оба условия были истинными
        Рим столица Италии & Берлин столица Голландии
        // Если хотя бы в одной части будет false -> в результате мы получим false
         */
        b2 = true & true; // true
        System.out.println("true & true: " + b2);
        b2 = (2 < 5) & (11 == 10); // true & false -> false
        System.out.println("(2 < 5) & (11 == 10): " + b2);

        // Введите число от 0 до 100.
        int z = 50;
        boolean b3 = z > 0 & z < 100;

        // Логическое ИЛИ "|"
        // Когда достаточно, чтобы ХОТЯ ЬЫ ОДНО условие было истинным

        boolean b4 = true | false;
        b4 = false | false; // false
        System.out.println("false | false: " + b4);
        System.out.println("true | false: " + (true | false));

        // Введите или четное число, или число, которое делится на 5 без остатка.
        // Четное число - это число, которое делится на 2 без остатка. Остаток от деления числа на 2 равен 0.

        // Генерация случайного числа (псевдослучайного числа)
        Random random = new Random();
        int rand = random.nextInt(101); // (0...101-1) -> (0..100) включительно
        System.out.println("Случайное число: " + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);

        System.out.println(" \n========== XOR =============");

        // Логическое исключающее ИЛИ (XOR) "^"
        // Возвращает true если две части выражения разные
        boolean b5 = true ^ false; // true
        System.out.println("true ^ false: " + b5);
        b5 = false ^ false;
        System.out.println("false ^ false: " + b5); // false
        System.out.println("true ^ true: " + (true ^ true)); // false
        System.out.println("false ^ true: " + (false ^ true)); // false

        System.out.println("\n =========== && ===========");

        // Логическое сокращенное И "&&"
        // Выдает true только если обе части выражение равны true
        boolean b6 = false && true;
        System.out.println("false && true: " + b6);
        b6 = (2 > 5) && (11 == 11);

        int a = 10;
        int b = 0;
        // Правая часть НЕ СЧИТАЕТСЯ (не выполняется просчет значения),
        // так как в левой части false и значение переменной b7 не зависит от правой части. Смысл ее считать?
        boolean b7 = (b != 0) && (a / b > 0); // 0 != 0 -> false //
        System.out.println(b7);

        System.out.println("\n ================ || =========");

        // Логическое сокращенное ИЛИ "||"
        // Выдает true если хотя бы одна часть выражения равна true
        boolean b8 = true || (a / b > 2);
        System.out.println("b8: " + b8);

        System.out.println("\n ============= Приоритет логический операций ====================");

         /*
        () -> ! -> & -> ^ -> | -> && -> ||
         */
        // Изменить приоритет логических операций можно скобками

        System.out.println( 2 + 10 / 2);

        System.out.println(true ^ true & false); // true
        System.out.println(true ^ false); // true
        System.out.println(true); // true




        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false);

         /*
        () -> ! -> & -> ^ -> | -> && -> ||
         */

        System.out.println("++++++++++++++++++++");
        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;
        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        System.out.println(true | false | (25 < 100) & !true ^ (2 == 5));
        System.out.println(true | false | true & !true ^ false);
        System.out.println(true | false | true & false ^ false);
        System.out.println(true | false | false ^ false);
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true);


    }
}


































