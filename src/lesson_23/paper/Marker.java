package lesson_23.paper;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Marker extends  Pen{
    @Override
    public void draw(String figureName) {
        System.out.println("Рисую маркером фигуру " + figureName);
    }
}
