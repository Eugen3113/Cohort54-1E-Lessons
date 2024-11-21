package homework_20.task1;

public class Rectangle extends Shape {
    private double width; // Ширина- width
    private double height; //  Высота- height

    public Rectangle() {
        super("Прямоугольник");
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = width * height;
        System.out.println("Площадь прямоугольника: " + area);
    }

}
