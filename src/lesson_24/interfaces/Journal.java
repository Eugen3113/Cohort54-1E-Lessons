package lesson_24.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.12.2024
 */

public class Journal implements Printable {
    private String name;
    private int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }


    @Override
    public void print() {
        System.out.println("Journal: " + name + " #" + number);
    }

    @Override
    public void defaultMethod() {
        System.out.println("Default method from Journal");
        // Специфика обращения к интерфейсу в качестве "super"
        // Printable.super.defaultMethod();
    }
}
