package lesson_24.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.12.2024
 */

/*
Интерфейс - это ссылочный тип в Java.
Интерфейс - совокупность абстрактных методов.

Абстрактный класс описывает свойства и поведение объектов.
А интерфейс содержит только поведение, которое класс будет реализовывать.

 */

// public abstract interface
public interface Printable {
    // Интерфейсы косвенно абстрактны. Нам не нужно использовать ключевое слово abstract. Оно присутствует по умолчанию.

    // В интерфейсе могут быть определены константы
    // public static final
    int CONST = 10;

    // В интерфейсе не может быть полей и конструкторов


    // Все методы интерфейса косвенно абстрактны и публичные
    // public abstract
    void print();

    // в JDK 8 были добавлены методы по умолчанию.
    // Это методы, которые имеют реализацию по умолчанию, которая используется в случае
    // если класс, реализующий интерфейс не переопределит этот метод,
    default void  defaultMethod() {
        System.out.println("Default method from interface");
    }

    // Начиная c JDK 8 доступны статические методы в интерфейсы
    static  void  staticMethod() {
        System.out.println("Static method from interface");
    }

    // Начиная с JDK 9 появилась возможность писать приватные методы
    // Они могут статические и не статические
    // Приватные методы НЕ МОГУТ быть переопределены в классе
    private void privateMethod() {
        System.out.println("Private method from interface");
    }

}
