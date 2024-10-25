package lesson_04;

import javax.print.attribute.standard.MediaSizeName;



public class TypeCharExample {
    public static void main(String[] args) {

        // Unicode- это специальная таблица (кодировка), которая содержит все символы мира.Укаждого символа есть свой номер

        char a = 'A'; // Переменная будет хранить букву A латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита, соответствующую коду 65 в десятичной системе исчисления
        char a2 = 0x41; // Присваеваем код в 16-ном формате. Что будет соответствовать букве А
        a2 = 0x0041; // полная форма записи в 16 системе исчисления
        char a3 = '\u0041';
        char x = '\u1507';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        // digit0 = (char) (digit0 + 5);
        digit0 += 5; // к digit0 прибавили 5 (и ненадо всё в -(char) переводить)

        /*
        1.digit0 (char) -> int
        2.сложение двух int -> int
        3.Нужно явно преобразовать int в char
         */

        System.out.println("digit0: " + digit0);

        char letter = 97;
        System.out.println("letter: " + letter);
        letter++;
        System.out.println("letter: " + letter);

        System.out.println("преобразовывание char -> int даст 10-й код символа: " + (int) letter);
        System.out.println(0 + letter); // так можно , но ненужно

        /*
        0...9 -> соответствует кодам 48...57
        a...z -> соответствует кодам 97...122
        A...Z -> соответствует кодам 65...90
         */


    }
}
// Герберт Шилдт
//Java Полное руководство Десятое издание
//Издательство Диалектика