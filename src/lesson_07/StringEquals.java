package lesson_07;

/**
 * {@code @date} 01.10.2024
 */

public class StringEquals {
    public static void main(String[] args) {

        int x = 10;

        String str1 = "Java";
        String str2 = "Java";
        String str4 = "JaVA";
        String str3 = new String("Java");
        System.out.println(str1 + " | " + str2 + " | " + str3);

        System.out.println("str1 == str2: " + (str1 == str2)); //Сравнивается значение ссылок. Адрес "привязанного" объекта в памяти // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str2 == str3: " + (str2 == str3)); // false

        System.out.println(str3 == str4); // false

        System.out.println("====== Equals ============ ");

        // Сравнивать строки нужно методом equals!!!
        // Сравнивать строки по значению - использовать метод equals
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

        // equalsIgnoreCase - сравнение двух строк по значению с игнорированием регистра букв
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true
    }
}

