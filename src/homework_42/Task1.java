package homework_42;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */


import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {


        option1();
        option2();

    } // Methods area


     private static void option1() {
         List<Integer> integers = List.of(4, 10, 53, 6, 81, 9, 45, 99, 17);

         List<Integer> res = integers.stream()
                 .filter(num -> num > 10)                          // Оставляем числа больше 10
                 .sorted(Comparator.comparing(num -> num % 10))    // Сортируем по последней цифре
                 .collect(Collectors.toList());                     //   Собираем в список

         System.out.println(res);

     }

     private static void option2() {
         List<Integer> sortByLastValue = Stream.generate(() -> new Random().nextInt(-50, 50)).limit(20).toList();

         List<Integer> sortByLastValue2 = sortByLastValue.stream()
                 .filter(num -> num > 10)
                 .sorted(Comparator.comparing(num -> num % 10))   // Сортируем по последней цифре в числе
                 .toList();
         System.out.println(sortByLastValue2);

     }


}

















