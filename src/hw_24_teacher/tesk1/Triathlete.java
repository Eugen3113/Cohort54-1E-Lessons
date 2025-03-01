package hw_24_teacher.tesk1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */

public class Triathlete implements Swimmer, Runner {

    @Override
    public void run() {
        System.out.println("Triathlete is running");  // триатлет бежит
    }

    @Override
    public void swim() {
        System.out.println("Triathlete is swimming");  // триатлет плывёт
    }
}
