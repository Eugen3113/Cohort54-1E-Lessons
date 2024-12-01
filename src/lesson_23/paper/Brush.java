package lesson_23.paper;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Brush extends Pen{   // Brush - щётка
    @Override
    public void draw(String figureName) {
        System.out.println("Рисую кистью фигуру " + figureName);
    }
}

