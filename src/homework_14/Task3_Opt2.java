package homework_14;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 31.10.2024
 */

/*
Task 3
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово и подсчитывает количество гласных и согласных букв в этом слове.
 */

public class Task3_Opt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // пишем сканер чтобы получить что-то от пользователя

        System.out.println("Введите слово");      //просим пользователя что-то ввести


        String cyr = "аеиоуюя";                 // русские гласные

        String input = scanner.nextLine();       //input -переменная, что считает сканер из консоли
        calculateCharacter(input);


    }

    public static void calculateCharacter(String text) { // пишем метод который распечатывает кол-во гласных. void -ничего невозвращает

        int vowels = 0;          // заводим две переменные .гласные
        int consonants = 0;      // согласные

        String vowelsList = "AEIOUYaeiouy";             // список латинских гласных
        String consonantsList = "ZXCVBNMSDFGHJKLWRTPzxcvbnmsdfghjklwrtp";  // согласные


        for (int i = 0; i < text.length(); i++) {    //перебираем символы
            char ch = text.charAt(i);                // выводим в переменную  ch


            if (vowelsList.indexOf(ch) >= 0) {
                // возвращает нам индекс вхождения символа в строку
                // Если символ найден - вернется какое-то положительное число - индекс символа в строке
                // Если символ не найден - метод вернет -1.
                vowels++;
            }

            if (consonantsList.indexOf(ch) >= 0) {
                consonants++;
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}


