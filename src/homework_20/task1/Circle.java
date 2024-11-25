package homework_20.task1;

public class Circle extends Shape{
    private double radius; // Радиус

    public Circle() {
        super("Круг");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга: " + area);
    }


}
