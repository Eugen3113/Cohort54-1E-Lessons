package lesson_23.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

/*
Абстрактный класс - используется для написания классов,
не предназначенных для создания объектов этого класса
 */

public abstract class Vehicle {
    private Engine engine;   // Engine - двигатель


    // Абстрактный метод - это метод без реализации.
    // Только объявление метода (без тела)
    // Предназначен для переопределения в подклассах (наследниках)
    public abstract void startEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                '}';
    }
}


