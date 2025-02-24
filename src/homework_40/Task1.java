package homework_40;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);                // пересечение множеств map1 и map2 по ключам
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));  // выводим пересечение множеств

    }

    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {  // пересечение множеств
        Map<String, Integer> intersectionMap = new HashMap<>();
        for (String key : map1.keySet()) {                                // перебираем ключи map1
            if (map2.containsKey(key)) {                                   // если ключ присутствует в map2
                intersectionMap.put(key, Math.min(map1.get(key), map2.get(key)));             // добавляем ключ и минимальное значение
            }
        }
        return intersectionMap;
    }
}
