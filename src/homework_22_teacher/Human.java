package homework_22_teacher;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Human {
    private final int runSpeed;
    private final int restTime;

    private String typeRunner = "Человек";

    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + " бежит со скоростью " + runSpeed +  " км/ч");
        rest();
    }

    public void rest() {
        System.out.println(typeRunner + " нужно для отдыха " + restTime + " минут");
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    @Override
    public String toString() {
        return "Human{" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                '}';
    }
}
