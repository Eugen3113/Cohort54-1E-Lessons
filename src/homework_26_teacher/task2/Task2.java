package homework_26_teacher.task2;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
 */

import lists.MyArrayList;

public class Task2 {
    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);

    }

    private static <T,U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        //
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

}
