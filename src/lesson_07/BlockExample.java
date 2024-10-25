package lesson_07;

/**
 * {@code @date} 01.10.2024
 */

public class BlockExample {

    public static void main(String[] args) {

        // Выравнивание кода Ctrl + Alt + L

        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        // x = x + y; // ошибка компиляции. Переменная y не видна (не доступна) вне своего блока.

    }

}

