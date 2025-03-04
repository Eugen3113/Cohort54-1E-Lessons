package homework_42;

/*

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа,
 затем каждое число умножить на 2, и собрать результат в новый список
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 9, 45, -45, 6, 93, 7, 61, 0, 28, -1);

        List<Integer> result = integers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
