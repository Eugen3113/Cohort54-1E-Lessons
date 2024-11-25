package homework_20.task1;

public class ShapeApp {

    public static void main(String[] args) {
        // Создаем объект прямоугольника и устанавливаем его размеры
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(8.0, 10.0);
        rectangle.setColor("Синий");
        rectangle.displayInfo();
        rectangle.calculateArea();

        System.out.println(); // Пустая строка для отделения вывода

        // Создаем объект круга и устанавливаем его радиус
        Circle circle = new Circle();
        circle.setRadius(7.0);
        circle.setColor("Красный");
        circle.displayInfo();
        circle.calculateArea();

    }

}
