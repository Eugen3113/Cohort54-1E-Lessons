package lesson_23.paper;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Pencil extends Pen{    // подчёркнуто красным,нажимаем: Alt + Enter и выбираем "Implement methods"

    @Override
    public void draw(String figureName) {
        System.out.println("Рисую карандашом " + figureName);
    }
}

