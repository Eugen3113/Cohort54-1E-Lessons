package homework_41;

/*
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A")
 и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = List.of("number", "Apple", "Banana", "Cat", "Dog", "Elephant", "Audi", "Zebra", "Aardvark");
        System.out.println(filterStartWith(strings));



    }

    public static List<String> filterStartWith(List<String> strings) { // метод, принимающий список строк и возвращающий новый
        // отфильтрованный список строк, которые начинаются на определенную букву (например, "A")
        return strings.stream()
                .filter(s -> s.startsWith("A")) //  в новом списке должны быть только те строки из старого списка
                                                // которые начинаются на определенную букву (по задаче: "A")
                //.filter(s -> s.charAt(0) == 'A')
                .sorted()
                .collect(Collectors.toUnmodifiableList());



    }
}
