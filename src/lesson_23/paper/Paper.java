package lesson_23.paper;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Paper {

    public void drawFigure(String figureName, Pen pen) {  // абстрактный метод "Pen pen"
        pen.draw(figureName);                        // draw - рисовать
    }
}

