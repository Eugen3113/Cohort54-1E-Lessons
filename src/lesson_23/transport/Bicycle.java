package lesson_23.transport;



/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Bicycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("У велосипеда нет двигателя");
    }
}

