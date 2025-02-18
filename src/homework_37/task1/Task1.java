package homework_37.task1;

/*
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>(); // это интерфейс List с элементами "Hello", "World", "Java", "Python", "VW"
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("VW");

        System.out.println("strings.size(): " + strings.size()); // 5

        Collection<String> strings2 = new LinkedList<>();  // это интерфейс List с элементами "Audi", "World", "VW", "BMW", "Mercedes", "Python", "Volvo"
        strings2.add("Audi");
        strings2.add("World");
        strings2.add("VW");
        strings2.add("BMW");
        strings2.add("Mercedes");
        strings2.add("Python");
        strings2.add("Volvo");

        System.out.println("strings2.size(): " + strings2.size()); // 9

        List<String> list = ListExample.intersection(strings, strings2);  // возвращает список, состоящий из элементов, которые присутствуют в обеих коллекциях
        System.out.println(list + "\n" + strings + "\n" + strings2);


        System.out.println("\n======================\n");

        strings.retainAll(strings2);
        System.out.println(strings);   // [World, Python, VW]

        strings2.retainAll(strings);
        System.out.println(strings2);  // [World, VW, Python]








    }
}
