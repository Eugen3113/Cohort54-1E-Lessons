package homework_39;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
  где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String text = "Тестовая строка для тестирования.Строка для удаления слов, которые повторяются.удаления.Тестовая?  Тестирования!";
        Map<String, Integer> frequencyMap = getWordByFrequency(text);   // Получаем частотный словарь слов в тексте
        System.out.println(frequencyMap);
    }
    private static Map<String, Integer> getWordByFrequency(String text) {     // Метод для получения частотного словаря слов в тексте
        Map<String, Integer> wordCountMap = new HashMap<>();                // Создаем словарь для хранения частоты слов в тексте

        String[] words = text.split("[^а-яА-Яa-zA-Z]+");  // Разбиваем текст на слова,
                                                              // используя регулярное выражение для удаления знаков препинания

        for (String word : words) {

            word = word.toLowerCase();                      // Приводим слово к нижнему регистру и проверяем, что оно не пустое
            if (!word.isEmpty()) {                         // Если слово не пустое - увеличиваем его частоту в словаре
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);  // Проверяем, что слово уже есть в словаре
                                                                                              // и увеличиваем его частоту
            }
        }
        return wordCountMap;
    }
}