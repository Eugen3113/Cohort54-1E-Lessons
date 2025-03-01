package homework_41;

/*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */

import java.util.List;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {


    } // main

    public static List<Integer> filer(List<Integer> integers) {   // метод, принимающий список чисел и возвращающий новый,
                                                                // отфильтрованный список
        return integers.stream()                               // в новом списке должны быть только те числа из старого списка которые соответствуют всем условиям
                .filter(n -> n % 2 == 0 && n > 10 && n < 100) // фидьтруем:  четные, больше 10 и меньше 100
                .collect(Collectors.toUnmodifiableList());





    }
}
