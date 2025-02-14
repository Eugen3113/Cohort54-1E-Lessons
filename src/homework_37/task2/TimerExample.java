package homework_37.task2;

/*
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

  - В первом методе - получение всех значений элементов списка по его индексу
  - Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
  - Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
  - Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
  - Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.

´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´
Пример метода
public class TimerExample {
    public static void main(String[] args) {
        // Измеряем и выводим время выполнения метода someMethod
        long duration = someMethod();
        System.out.println("Время выполнения метода: " + duration + " миллисекунд");
    }

    private static long someMethod() {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода


        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }
}

Объяснение кода
Метод someMethod:
В начале метода фиксируем текущее время с помощью System.currentTimeMillis(), чтобы определить время начала выполнения (startTime).
В теле метода выполняем нужные операции.
В конце метода фиксируем текущее время еще раз, чтобы определить время окончания выполнения (endTime).
Возвращаем разницу между временем окончания и началом выполнения, что дает нам время выполнения метода в миллисекундах.

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TimerExample {

    private static final int SIZE = 5000;
    private static final int INSERT_COUNT = 2000;
    private static final int REMOVE_COUNT = 1000;
    private static final int RANDOM_VALUE_RANGE = 10_000;


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            int value = random.nextInt(1001);
            arrayList.add(value);
            linkedList.add(value);

            long startTime, endTime;                                                                 //
            startTime = System.currentTimeMillis();                                                  //

            System.out.println("ArrayList:");
            System.out.println("Get values time: " + getValuesTime(arrayList) + " ms");
            System.out.println("Insert values time: " + insertValuesTime(arrayList) + " ms");
            System.out.println("Remove by index time: " + removeByIndexTime(arrayList) + " ms");
            System.out.println("Remove by value time: " + removeByValueTime(arrayList) + " ms");


            endTime = System.currentTimeMillis();

            System.out.println("Total time для ArrayList: " + (endTime - startTime) + " ms");


            startTime = System.currentTimeMillis();

            System.out.println("\nLinkedList:");
            System.out.println("Get values time: " + getValuesTime(linkedList) + " ms");
            System.out.println("Insert values time: " + insertValuesTime(linkedList) + " ms");
            System.out.println("Remove by index time: " + removeByIndexTime(linkedList) + " ms");
            System.out.println("Remove by value time: " + removeByValueTime(linkedList) + " ms");

            endTime = System.currentTimeMillis();

            System.out.println("Total time для LinkedList: " + (endTime - startTime) + " ms");

        }

    }

    private static String removeByValueTime(List<Integer> arrayList) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000  ; i++) {
            int value = random.nextInt( 10000 + 1);
            arrayList.remove(Integer.valueOf(value));
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        return String.format("Remove by value time: %d ms", executionTime);


    }

    private static String removeByIndexTime(List<Integer> arrayList) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(arrayList.size());
            arrayList.remove(index);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        return String.format("Remove by index time: %d ms", executionTime);

    }

    private static String insertValuesTime(List<Integer> arrayList) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 2000; i++) {
            int index = random.nextInt(arrayList.size() + 1);
            arrayList.add(index, random.nextInt(1001));
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        return String.format("Insert values time: %d ms", executionTime);

    }

    private static String getValuesTime(List<Integer> arrayList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        return String.format("Get values time: %d ms", executionTime);

    }

}
