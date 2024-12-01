package lesson_23.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Motocycle extends Vehicle {

    public Motocycle(Engine engine) {
        super();
        setEngine(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Motocycle");
        this.getEngine().start();
    }

}

