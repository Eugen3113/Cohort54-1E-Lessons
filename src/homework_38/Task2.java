package homework_38;

/*
Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами.
Некоторые слова должны повторяться в обоих множествах.

Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество,
содержащее все уникальные элементы из обоих множеств (объединение множеств).

Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество, содержащее только элементы,
которые присутствуют в обоих исходных множествах (пересечение множеств).

Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов, которые есть в первом множестве,
но отсутствуют во втором (разность множеств).

Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций.

    Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
    Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

    System.out.println(SetUtils.union(set1, set2));
    System.out.println(SetUtils.intersection(set1, set2));
    System.out.println(SetUtils.difference(set1, set2));

    // Output:
    [A, B, C, D, E, F]
    [C, D]
    [A, B]
    */


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Task2 {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));   // создание множеств
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));   // создание множеств

        System.out.println("Set1 : " + set1);                             // вывод множеств в консоль set1
        System.out.println("Set2 : " + set2);                             // вывод множеств в консоль set2

        Set<String> unionSet = union(set1, set2);                         // объединение множеств
        System.out.println("UnionSet: " + unionSet);

        Set<String> intersectionSet = intersection(set1, set2);           // пересечение множеств
        System.out.println("Intersection: " + intersectionSet);

        Set<String> differenceSet = difference(set1, set2);                // разность множеств
        System.out.println("Difference: " + differenceSet);


    }


    public static Set<String> union(Set<String> set1, Set<String> set2) {           // объединение множеств
        Set<String> result = new HashSet<>(set1);                                   // создание нового множества
        result.addAll(set2);                                                        // добавление элементов из второго множества
        return result;

    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {    // пересечение множеств
        Set<String> result = new HashSet<>(set1);                                   // создание нового множества
        result.retainAll(set2);                                                      // оставляем только элементы, которые есть в обоих множествах
        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {        // разность множеств
        Set<String> result = new HashSet<>(set1);                                     // создание нового множества
        result.removeAll(set2);                                                       // удаляем элементы, которые есть во втором множестве
        return result;
    }

}


