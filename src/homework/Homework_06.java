// Eugen Grünwald
// Cohort 54.1
// homework_06


package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework_06 {
    public static void main(String[] args) {

        System.out.println("Task 1 =======================");

        /*

        Дан текст Programming is fun.

        Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.
         */

        String string = "Programming is fun";
        boolean contains = string.contains("fun");
        System.out.println("string.contains(\"fun\"): " + contains);
        System.out.println();
        System.out.println("Task 2 =======================");

        /*
        Создайте две переменные типа int.

        В первую переменную запишите случайное значение от 0 до 50.
        Во вторую переменную случайное значение от 0 до 100.
        (опционально) Во вторую переменную случайное значение от -20 до 30.

        Проверьте:

        равны ли переменные,

        не равны ли они,

        больше ли a, чем b,

        и меньше ли b, чем a.

        Выведите результат на экран.
         */

        Random random = new Random();

        int ran1 = random.nextInt(51);
        int ran2 = random.nextInt(101);
        System.out.println("случайное число: " + ran1);
        System.out.println("случайное число: " + ran2);

        boolean b1 = (ran1 == ran2);
        System.out.println(ran1 + " == " + ran2 + " -> " + b1);
        boolean b2 = (ran1 != ran2);
        System.out.println(ran1 + " != " + ran2 + " -> " + b2);
        boolean b3 = (ran1 > ran2);
        System.out.println(ran1 + " > " + ran2 + " -> " + b3);
        boolean b4 = (ran2 < ran1);
        System.out.println(ran2 + " < " + ran1 + " -> " + b4);


        System.out.println();
        System.out.println("Task 3 =======================");

        /*
        Попросите пользователя ввести целое число с клавиатуры.
        Ваша программа должна вывести строку в формате:
        Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
        Copy
        Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        boolean a1 = (a % 2 == 0);
        boolean a2 = (a % 3 == 0);
        boolean a3 = (a % 2 == 0) && (a % 3 == 0);
        System.out.println("Число: " + a + ";" + " чётное: " + a1 + ";" + " кратно 3: " + a2 + "; " + "чётное и кратное 3: " + a3 );

        System.out.println();
        System.out.println("Task 4 =======================");

        /*
        *Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.
        Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
         */
        int a5 = 8;
        int b5 = 3;
        boolean result;

        result = (a5 + b5) > 10;
        System.out.println("Result 1: " + result);

        result = (a5 - b5) == 5;
        System.out.println("Result 2: " + result);

        result = (a5 * b5) != 24;
        System.out.println("Result 3: " + result);

        result = (a5 / b5) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a5 % b5 == 2);
        System.out.println("Result 5: " + result);

        /*
        *  Result 1: true   (8 + 3) > 10;  11  больше> 10   = true
        *  Result 2: true   (8 - 3) == 5;   5  равно== 5    = true
        *  Result 3: false  (8 * 3) != 24;  24 = 24 = true, ! меняет равенство на противоположное зн-е  = false
        *  Result 4: true   (8 / 3) >= 2;   8 делим на 3 равно целое число 2. Знак >= указывает два больше или равно двум.  = true
        *  Result 5: false   !(8 % 3 == 2);  в скобках будет true, ! меняет значение на противоположное  = false

         */

    }
}
