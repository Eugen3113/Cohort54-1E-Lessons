package hw_37_teacher;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.02.2025
 */

/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

public class Task11 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3)); // это коллекция ArrayList с элементами 3, 4, 4, 5, 5, 6, 7, 8
        List<Integer> integers1 = new LinkedList<>(List.of(3, 4, 4, 5, 5, 6, 7, 8)); // это коллекция LinkedList с элементами 3, 4, 4, 5, 5, 6, 7, 8

        List<Integer> result = intersection(integers, integers1); // возвращает список, состоящий из элементов, которые присутствуют в обеих коллекциях
        System.out.println(result);                              // [3, 4, 5, 3]
        System.out.println(intersection(integers1, integers));   // [3, 4, 4, 5, 5]

    }


    public static <T> List<T> intersection(List<T> list1, List<T> list2) {   // <T> - означает, что метод может работать с любым типом
        List<T> result = new ArrayList<>(list1);                             // создаем новую коллекцию ArrayList с элементами из list1
        result.retainAll(list2);                                             // удаляем все элементы, которые не присутствуют в list2
        return result;                                                       // возвращаем результат
    }
}

