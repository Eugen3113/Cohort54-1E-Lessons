package lesson_03;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable; // Объявление (декларация) переменной типа int

        myFirstVariable = 1; // Первое присвоение значения переменной называется инициализацией

        int mySecondVariable = 25; // Объявление и инициализация в одной строке

        System.out.println(mySecondVariable);

        // Strg + Alt + l выравниваем код (Pritter)

        mySecondVariable = 50 ; // присвоение нового значения

        System.out.println("Значение переменной mySecondVariable: " +  mySecondVariable);

        byte byteVariable = 125; // Объявление и инициализация типа byte

        System.out.println("byteVariable: " + byteVariable);

        // (Strg)Ctrl + D скопировать строчку, в которой находится курсор
        // (Strg)Ctrl + Y удалить строчку, в которой находится курсор
        //

        byteVariable = -100;
        System.out.println("byteVariable: " + byteVariable);

        short shortVariable; // Объявление и инициализация типа short
        shortVariable = 31000; // инициализация переменной

        System.out.println("shortVariable: " + shortVariable);

        long longVariable = 2_100_000_000_000_000_000L;
        // L в конце числа , число в формате long
        System.out.println("longVariable: " + longVariable);

        double doubleVariable = 10.5421;// Объявление и инициализация типа double
        System.out.println("doubleVariable: " + doubleVariable);

        float floatVariable = 11.65f;// f/F - число в формате  float
        System.out.println("floatVariable: " + floatVariable);


    }
}
