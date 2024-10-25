package homework_09;
/*
Task 5
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */



import java.util.Arrays;

public class Task5 {



    public static void main(String[] args) {
        String[] array = { "One", "Two", "Twenty" };
        printLongestString(array);
    }
                       // Метод для нахождения самой длинной строки и вывода её символов
    public static void printLongestString(String[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив пустой или равен null.");
            return;
        }

        String longestString = Arrays.stream(array)
                .reduce("", (a, b) -> a.length() >= b.length() ? a : b);

        Arrays.stream(longestString.split(""))
                .forEach(character -> System.out.println(character + " "));
    }


}

// forEach — это метод массива в JavaScript, который позволяет выполнить заданную функцию один раз для каждого элемента массива.
// Он не создает новый массив и возвращает undefined. Это полезно для выполнения побочных эффектов на каждом элементе массива,
// таких как вывод значений в консоль или изменение внешних переменных.