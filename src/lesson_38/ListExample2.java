package lesson_38;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.02.2025
 */

public class ListExample2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 10, 100, -5, 0, 100, 11, 54)); // это интерфейс List с элементами 1, 10, 100, -5, 0, 100, 11, 54


        // Поиск элемента по значению - возвращает индекс
        // int indexOf(Object obj) - первое вхождение
        // int lastIndexOf(Object obj) - последнее вхождение

        System.out.println("list.indexOf(100): " + list.indexOf(100));      // возвращает индекс первого вхождения элемента по значению
        System.out.println("list.lastIndexOf(100): " + list.lastIndexOf(100));  // возвращает индекс последнего вхождения элемента по значению
        System.out.println("list.indexOf(-10000)): " + list.indexOf(-10000));  // возвращает индекс первого вхождения элемента по значению
        System.out.println("list.indexOf(\"String\"): " + list.indexOf("String"));  // возвращает индекс первого вхождения элемента по значению

        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора

        list.sort((i1, i2) -> Integer.compare(i2, i1));    // сортирует список в обратном порядке

        System.out.println(list);                           // [-5, 0, 1, 10, 11, 54, 100, 100]

        list.sort(Integer::compare);           // сортирует список в обратном порядке с использованием интерфейса Comparator с методом compare

        list.sort(Comparator.naturalOrder());  // сортирует список в обратном порядке с использованием интерфейса Comparator с методом compare

        System.out.println(list);               // [-5, 0, 1, 10, 11, 54, 100, 100]

        // List<E> subList(int idxFrom, int idxTo) - возвращает список из элементов,
        // находящихся на позициях от idxFrom до idxTo
        List<Integer> subList = list.subList(1, 5);             // возвращает список из элементов, находящихся на позициях от 1 до 5
        System.out.println("list.subList(1, 5): " + subList);   // [0, 1, 10, 11]
    }                                                           // subList - это интерфейс List
}


/*
list.indexOf(100): 2
list.lastIndexOf(100): 5
list.indexOf(-10000)): -1
list.indexOf("String"): -1
[100, 100, 54, 11, 10, 1, 0, -5]
[-5, 0, 1, 10, 11, 54, 100, 100]
list.subList(1, 5): [0, 1, 10, 11]
 */
