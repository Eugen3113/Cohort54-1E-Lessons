package homework_14;

/**
 * @author Sergey Bugaenko
 * {@code @date} 31.10.2024
 */
/*
Task 1
Сумма четных чисел

Напишите метод, который вычисляет сумму всех четных чисел в массиве.


 */

public class Task1 {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sumArray(testArray));
    }

    public static int sumArray(int[] array) {
        if (array == null) return 0; // Проверяем пришёл ли к нам массив(если ссылка на массив == null)

        int sum = 0;

        for (int i = 0; i < array.length; i++) {   //Перебераем массив
            if (array[i] % 2 == 0) {               //проверяем на чётность
                sum += array[i];
            }

        }
        return sum;
    }
}
