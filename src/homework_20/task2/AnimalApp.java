package homework_20.task2;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 3, "Siamese");
        Mouse mouse = new Mouse("Jerry", 1);

        System.out.println(cat); // Вызывает метод - toString() класса Cat
        cat.meow(); // Вызов метода  - meow()

        System.out.println(mouse); // Вызывает метод toString() класса Mouse
        mouse.caught(); // Поймать мышку
        System.out.println(mouse); // Проверка информации о мышке после поимки
        mouse.escape(); // Освобождение мышки
        System.out.println(mouse);

    }
}
