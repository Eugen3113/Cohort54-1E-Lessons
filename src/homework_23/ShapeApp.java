package homework_23;

public class ShapeApp {
    public static void main(String[] args) {

        Circle circle = new Circle(8);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());


        System.out.println("==========");

        Rectangle rectangle = new Rectangle(8, 12);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        System.out.println("===============0");

        Triangle triangle = new Triangle(2, 6, 5);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        System.out.println("================");


        Shape[] shapes = new Shape[]{new Circle(12), new Rectangle(9, 4), new Triangle(15, 26, 17) };

        double totalArea = 0;



        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].area();

        }

        System.out.println("Общяя площадь : " + String.format("%.2f", totalArea));





    }
}
