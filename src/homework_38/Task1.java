package homework_38;

/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

import java.util.*;
import java.util.stream.Collectors;



public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";  //   Вводим строку
        Object StringUtil = getUniqueSortedWords(testString);                                                       // Вызываем метод
        System.out.println(StringUtil.toString());                                                                  // Выводим результат
    }

    private static Object getUniqueSortedWords(String testString) {                      // Метод принимает строку и возвращает список уникальных слов
        List<String> words = Arrays.asList(testString.split("[^а-яА-Яa-zA-Z]"));  // Разбиваем строку на слова
        return words.stream()
                .filter(word -> !word.isEmpty())                                           // Убираем пустые строки
                .distinct()                                                                 // Убираем дубликаты слов в списке
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))  // Сортируем слова по длине и в алфавитном порядке
                .collect(Collectors.toList());                                                  // Собираем в список
    }

}



