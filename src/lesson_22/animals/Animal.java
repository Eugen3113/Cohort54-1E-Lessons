package lesson_22.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.11.2024
 */

public class Animal {



    public void voice() {
        System.out.println("Animal say something");
    }

    // Полиморфизм. Переопределение метода родительского класса - Object
    @Override
    public String toString() {
        return "Animal to String";
    }
}

