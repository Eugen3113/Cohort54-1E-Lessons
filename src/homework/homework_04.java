// Eugen Grünwald
// Cohort 54.1
// homework_04

package homework;

public class homework_04 {
    public static void main(String[] args) {

        System.out.println("Task 1 ====================\n");
        /*
        Task 1
        Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
Ожидаемый результат:

Значение myDouble: 10.0
         */
        int myInt = 10;
        double myDouble;
        myDouble = myInt;
        System.out.println("myDouble: " + myDouble);

        System.out.println("Task 2 ====================\n");
        /*
        Task 2
Явное преобразование double в int
Напишите программу, которая:

Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
Выводит значение myInt на экран.
Ожидаемый результат:

Значение myInt: 5
         */

        double myDouble1 = 5.99;
        int myInt1 = (int) myDouble1;
        System.out.println("myDouble1: " + myDouble1);
        System.out.println("myInt1: " + myInt1);

        System.out.println("Task 3 ====================\n");

        /*
        Task 3 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
         */

        long bigNumber = 15000000000L;
        int smallNumber = (int) bigNumber;

        System.out.println("bigNumber: " + bigNumber);
        System.out.println("smailNumber: " + smallNumber);

        System.out.println("Task 4 ====================\n");

        /*
        Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.

Пример программы:

public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';
         */

        char ch1 = 'e';
        char ch2 = 'u';
        char ch3 = 'g';
        char ch4 = 'e';
        char ch5 = 'n';

        char upCh1 = (char) (ch1 - 32);
        char upCh2 = (char) (ch2 - 32);
        char upCh3 = (char) (ch3 - 32);
        char upCh4 = (char) (ch4 - 32);
        char upCh5 = (char) (ch5 - 32);

        System.out.print(upCh1);
        System.out.print(upCh2);
        System.out.print(upCh3);
        System.out.print(upCh4);
        System.out.print(upCh5);
        System.out.println();

        // второй способ:
         ch1 -= 32;
         ch2 -= 32;
         ch3 -= 32;
         ch4 -= 32;
         ch5 -= 32;

        // Todo разобраться, почему по разнному выводятся символы

         System.out.println("Имя: " + ch1 + ch2 + ch3 + ch4 + ch5);

    }
}
