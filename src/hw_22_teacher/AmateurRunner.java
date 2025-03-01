package hw_22_teacher;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class AmateurRunner extends Human {

    public AmateurRunner() {
        super(15, 10);
        this.setTypeRunner("Любитель");
    }

    public AmateurRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
}