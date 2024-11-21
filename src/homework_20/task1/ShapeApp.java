package homework_20.task1;

public class ShapeApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(8.0, 10.0);
        rectangle.setColor("Синий");
        rectangle.displayInfo();
        rectangle.calculateArea();

        System.out.println();

        //  Объект круга и устанавливаем его радиус
        Circle circle = new Circle();
        circle.setRadius(7.0);
        circle.setColor("Красный");
        circle.displayInfo();
        circle.calculateArea();

    }


}
