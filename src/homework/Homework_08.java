// Eugen Grünwald
// Cohort 54.1
// homework_08


package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework_08 {
    public static void main(String[] args) {
        System.out.println("Task1 =======================");
        /*
        Найдите произведение всех чисел от 1 до 10 включительно.

        Результат выведите на экран
         */
        int sum = 1;
        int i = 1;

        while (i <= 10) {
            sum = sum * i;
            i++;
        }

        System.out.println("Произведение всех чисел от 1 до 10 = " + sum); // 3628800
        System.out.println();

        System.out.println("Task2 =======================");

        /*
        Используйте цикл while для решения задачи:

        Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
         */
        String string = "Task";
        int i1 = 1;
        while (i1 <= 10) {
            System.out.print(string + i1 + ", ");
            i1++;
        }
        System.out.println();
        /* Решение учителя:
          int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i++);
        }

         */
        System.out.println();

        System.out.println("Task3 =======================");

        /*
        Используйте цикл while для решения задачи:

        Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
         */

        int i2 = 1;
        while (i2 <= 100) {
            if (i2 % 5 == 0) {
                System.out.println(i2);
            }
            i2++;
        }
        System.out.println();


        System.out.println("Task3.1* =======================");

        /*
        Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
        Решение учителя задача 3 и 3.1* вместе
         */

//        int i = 1;
//        int count = 0;
//
//
//        while (i <= 100 && count < 7) {
//            // System.out.println("Проверяю число: " + i);
//            if (i % 5 == 0) {
//                System.out.print(i + ", \n");
//                count++;
//
//            }
//            i++;
//
//        }

        System.out.println("Task4* =======================");

        /*
        Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово,
        программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод,
        пока не будет введено правильное слово.

        Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
         */

        System.out.println("Task5* =======================");

        /*
        Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

        Пример:

        567432 -> 5+6+7+4+3+2 -> 27
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите произвольное число: ");
        String input = scanner.nextLine();

        int sum4 = 0;          // Переменная для хранения суммы цифр
        int number;          // Переменная для хранения цифр

        int length = input.length(); // Получаем длину введенного числа
        int index = 0;       // Индекс для прохода по строке

        // Используем while для вычисления суммы цифр
        while (index < length) {
            number = Character.getNumericValue(input.charAt(index)); // Извлекаем цифру
            sum4 += number;  // Добавляем цифру к сумме
            index++;        // Переходим к следующей цифре
        }

        System.out.println("Сумма цифр числа " + input + " равна " + sum4);

        scanner.close();     // Закрываем сканер
        System.out.println();


        System.out.println("Task6 =======================");

        /*
        Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

        Вывести на экран:

        Минимальное значение в массиве
        Максимальное значение в массиве
        Среднее арифметическое всех значений в массиве
         */
        Random random = new Random();
        int len = random.nextInt(11) + 5;

        int[] array = new int[len];

        int i3 = 0;
        System.out.print("[");
        while (i3 < array.length) {
            array[i3] = random.nextInt(101) - 50; // [-50, 50]
            System.out.print(array[i3] + ((i3 < array.length -1) ? ", " : "]\n"));

//            if (i < array.length -1) {
//                System.out.print(", ");
//            } else {
//                System.out.print("]");
//            }

            i3++;
        }

        int min = array[0];
        int max = array[0];
        int sum5 = 0;

        i3 = 0;
        while (i3 < array.length) {
            sum += array[i3];

            if (array[i3] > max) max = array[i3];
            if (array[i3] < min) min = array[i3];

            i3++;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("sum: " + sum5);
        System.out.println("average: " + sum5 / (double) array.length);

//        min: -49      // ок
//        max: 10       // ок
//        sum: 0        // что-то не так выдаёт ответ
//        average: 0.0  // что-то не так выдаёт ответ



        System.out.println("Task7 =======================");

        /*
        Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

        Пример:

        { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
         */

        int[] array7 = {5, 6, -25, 0, 31, -15};

        int minIndex = 0;
        int maxIndex = 0;

        int i7 = 0;
        while (i7 < array7.length) {

            if (array7[i7] > array[maxIndex]) {
                maxIndex = i7;
            }

            if (array7[i7] < array[minIndex]) {
                minIndex = i7;
            }

            i7++;
        }

        System.out.println("minIndex = " + minIndex + ", число: " + array[minIndex]);
        System.out.println("maxIndex = " + maxIndex + ", число: " + array[maxIndex]);

        // swap
        int temp = array7[minIndex];
        array7[minIndex] = array7[maxIndex];
        array7[maxIndex] = temp;

        i7 = 0;
        while (i7 < array7.length) {
            System.out.print(array[i7++] + ", ");
        }
        System.out.println();


        System.out.println();

    }
}
