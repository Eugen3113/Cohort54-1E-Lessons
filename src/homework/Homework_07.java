// Eugen Grünwald
// Cohort 54.1
// homework_07


package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework_07 {
    public static void main(String[] args) {
        System.out.println("Task1 =======================");

        /*
        Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

        Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();

        if (x == 1) {
            System.out.println("Вы ввели число: " + "Один");
        } else if (x == 2) {
            System.out.println("Вы ввели число: " + "Два");
        } else if (x == 3) {
            System.out.println("Вы ввели число: " + "Три");
        } else {
            System.out.println("Вы ввели не верное число!");
        }

        System.out.println("===Switch===");

        switch (y) {
            case 1:
                System.out.println("Switch: Вы ввели число: " + "Один");
                break;
            case 2:
                System.out.println("Switch: Вы ввели число: " + "Два");
                break;
            case 3:
                System.out.println("Switch: Вы ввели число: " + "Три");
                break;
            default:
                System.out.println("Вы ввели не верное число!");

        }

        System.out.println("Продолжение программы после switch");

        // учитель показывал: код ниже v  //
             System.out.println("введите строку");
        String inputStr = scanner.nextLine();

        System.out.println("Введите число 1, 2 или 3");
        int input = scanner.nextInt(); // в тип данных int -> он считывает токен
         scanner.nextLine(); // В тип данных String -> от начала строки до конца строки

        System.out.println("Введите ваш возврат:");
        int age = scanner.nextInt();

        System.out.println("inputStr " + inputStr);
        System.out.println("input: " + input);
        System.out.println("age: " + age);
        // учитель показывал:код выше ^ //


        System.out.println("Task2 ========================");

        /*
        Запишите в 4 переменные случайные числа от 0 до 100.
        Выведите все 4 числа на экран.
        Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
        Output:
        Максимальное число: 33
         */
        Random random = new Random();

        // 1 ВАРИАНТ МОЙ :
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);

        System.out.println(a + " | " + b + " | " + c + " | " + d);

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Максимальное число: " + max);

        // 2 ВАРИАНТ УЧИТЕЛЯ :

        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);

        System.out.printf("%d | %d | %d | %d\n", var1, var2, var3, var4);

        int max2 = var1;
        if (var2 > max2) max2 = var2;
        if (var3 > max2) max2 = var3;
        if (var4 > max2) max2 = var4;

        System.out.println("max: " + max);


        System.out.println("Task3 ========================");

        /*
        (Повышенной сложности, опционально)
        Программа предлагает пользователю ввести четырехзначное число.
        Ввод осуществляется только в формате строки (String).
        Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
        Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
        Примеры:

        Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
        Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
         */

        //Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырехзначное число");
        String digitStr = scanner.nextLine();

        // Option 1
        if (digitStr.length() != 4) {
            // Строка состоит не из 4 символов
            System.out.println("выводится сообщение об ошибке");
        } else {

//            System.out.println(digitStr + 1000);
            // Строка из 4-ч символов. Код обработки этой строки
            // 0...9 -> 48 - 57;

//            int char1 = digitStr.charAt(0) - 48;
//            int char2 = digitStr.charAt(1) - 48;
//            int char3 = digitStr.charAt(2) - 48;
//            int char4 = digitStr.charAt(3) - 48;

            // Проверка, что символ является цифрой
            if (digitStr.charAt(0) < 48 || digitStr.charAt(0) > 57) {
                System.out.println("Введено не число");
            }


            if (digitStr.charAt(0) + digitStr.charAt(1) == digitStr.charAt(2) + digitStr.charAt(3)) {
                System.out.println("Счастливый билет!");
            } else {
                System.out.println("Билет не счастливый");
            }


            //Option 2
            if (digitStr.length() == 4) {
                // Код обработки строки
                // Строка кода может вызвать аварийное завершение программы при некорректном вводе
                int input2 = Integer.parseInt(digitStr);
                  // здесь input2, так как input уже в первой задаче объявлен.
//            System.out.println(input + 1000);

                // 1234 / 10 -> 123; % 10 -> 4
                int digit0 = input2 % 10;
                input2 = input2 / 10;

                // 123
                int digit1 = input2 % 10;
                input2 = input2 / 10;

                // 12
                int digit2 = input2 % 10;
                int digit3 = input2 / 10;

                System.out.printf("Цифры %d, %d, %d, %d\n", digit0, digit1, digit2, digit3);

                if (digit0 + digit1 == digit2 + digit3) {
                    System.out.println("Вариант 2. Число счастливое!");
                } else {
                    System.out.println("Вар2. Не счастливое");
                }

            } else {
                System.out.println("Вы ввели не 4-значное число");
            }


        }

        System.out.println("Task4 ========================");

        /*
        Напишите программу с использованием оператора switch:

        Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на консоль "Понедельник",
        2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
         */

        System.out.println("Введите число от 1 до 7: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Таких дней недели не придумали!");

        }

        System.out.println("Продолжение программы после switch");


        System.out.println("Task5 ========================");

        /*
         (Опционально)
        Используйте оператор switch для решения задачи:

        Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система.
        Запишите в переменную случайное число от 0 до 12.

        Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

        Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
        Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
        Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
        Оценка 3 балла: огорчитесь и вычтите 30 минут.
        Оценка меньше 3 баллов: запретите телевизор на сегодня.
        Выведите на экран оставшееся время для просмотра ТВ.

        P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
         */

        // Todo моё решение неверно исправить


        //int watchTime = 60 - todayWatchTime;
        int note = random.nextInt(12) + 1;
        System.out.println("Note: " + note);
        int todayWatchTime = 45;

        switch (todayWatchTime) {
            case 10:
            case 11:
            case 12:
                System.out.println("Мы рады: " + (todayWatchTime + 60));
                break;
            case  7:
            case  8:
            case  9:
                System.out.println("Молодец: " + (todayWatchTime + 45));
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Можно лучше: " + (todayWatchTime + 15));
                break;
            case 3:
                System.out.println("Огорчились: " + (todayWatchTime - 30));
                break;
            default:
                System.out.println("Запрет просмотра телевизора на сегодня");
                break;
        }

        System.out.println("todayWatchTime: " + todayWatchTime);

    }
}
