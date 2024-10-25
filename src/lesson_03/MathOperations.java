package lesson_03;

public class MathOperations {

    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;
         // сложения

        result = var1 + var2;
        System.out.println(" var1 + var2 = " +  result);

        result = 15 + 6 + var1;
        System.out.println("result: " + result);

        // Вычитание "-"
        result = var1 - var2;
        System.out.println("var1 + var2 = " + result);

        // умножение "*"
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        // Целочисленное деление "/"
        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

        // остаток от деления "%"
        int rest = var1 % var2;
        System.out.println("целолчисленное деление 4 / 2: " + (4 / 2)); // 2
        System.out.println("остаток от  деления 4 % 2: " + (4 % 2)); // 0

        System.out.println("5 / 10 = " + (5 / 10)); // 0
        System.out.println("5 % 10 = " + (5 % 10)); // 5

        System.out.println(" ======================= \n");

        result = 2 + 10 / 2; // 7
        result = (2 + 10) / 2; // 6

        System.out.println(result);

        System.out.println(" ==================0\n");

        double x = 20.0d; // d - в формате double
        double y = 7.0; // все числа , записанные в нашем коде с "."  считаются в формате double

        // деление
        double resultDouble = x / y;
        System.out.println("resultDouble = " + resultDouble);

        int a = 20;
        int b = 7;
        int res = 20 / 7;

        System.out.println("Результат деления " + a + " на " + b + " равен = " + res);
        /*
        %d -  целое число
        %s - текст
        %f -  число с плавающей точкой
        %n -  символ новой строки
        \n -  символ новой строки
         */

        // Форматированный вывод. Мы используем шаблон и список значений, которые будут поставлены в этот шаблон.
        System.out.printf("Результат деления %d на %d равен = %d\n", a , b , res);
        System.out.println("Test");

        System.out.printf("Округлённый вывод результата деления %f\n", resultDouble);
        System.out.printf("Округлённый вывод результата деления %.4f\n", resultDouble);// %.4 - процент точка 4 - выводит 4 цифры после запятой

        // Проблема с double
        double x1 = 0.1;
        double y1 = 0.2;
        double z = x1 + y1; // 0.3
        System.out.println("0.1 + 0.2 = " + z); // 0.1 + 0.2 = 0.30000000000000004

        x1 = 1.0;
        y1 = 4.0;
        z = x1 / y1; // 0.25
        System.out.println("z: " + z); // 0.25


    }
}
