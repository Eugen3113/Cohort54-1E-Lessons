package homework_42;

/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = List.of("Carnival", "Spring", "Candy", "Pancakes", "Costumes");

        Stream<String> stream = strings.stream()
                .filter(str -> str.length() < 6);
                //.min(String::compareTo)
                //.ifPresent(System.out::println);

        List<String> shortStrings = stream.collect(Collectors.toList());

        System.out.println("shortStrings: " + shortStrings);


    }
}
