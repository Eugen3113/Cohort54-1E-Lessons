package homework_14;

/**
 * @author Sergey Bugaenko
 * {@code @date} 31.10.2024
 */

/*
Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел(int).
 */

public class Task2 {

    public static void main(String[] args) {                       //7.
        int[] test = {7, 9, 6, 5, 8, 10, 3, 10};                   //8.

        int second = secondMaxValue(test);
        System.out.println("second max: " + second);               //10.END
    }

    public static int secondMaxValue(int[] array) {          //Start 1.пишем метод
        if (array == null || array.length == 0) {            // 2.проверяем массив
            return Integer.MIN_VALUE;                        // способ получить минимальное число типа int
        }
        // Integer.MAX_VALUE максимальное число диапазона int

        int max = array[0];                                //3. заводим две переменные
        int secondMax = array[0];                          //. -------------

        for (int i = 1; i < array.length; i++) {           //4. перебираем массив
            int num = array[i];                            //. текущий элемент записываем в номер (array[i] в  num)

            if (num > max) {                               //5.проверяем что наш num больше max
                secondMax = max;                           //. записываем второе по величине число в secondMax
                max = num;                                 //. записываем максимальное число в max
            } else if (num > secondMax && num != max) {    //. проверяем если num больше secondMax и num неравен max,
                secondMax = num;                           //. тогда перезапишем secondMax (второе по величине число)
            }
        }

        return secondMax;                                  //6. выводим secondMax (второе по величине число)


    }
}
