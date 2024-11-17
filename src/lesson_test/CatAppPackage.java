package lesson_test;

import lesson_17.cats.Cat;

public class CatAppPackage {

    public static void main(String[] args) {

        Cat cat = new Cat("Max", 5, 10);

        System.out.println(cat.toString());

        cat.sayMeow();


    }
}
