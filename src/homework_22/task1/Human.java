package homework_22.task1;

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человеку нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */

public class Human {

    private final int runSpeed;
    private final int restTime;
    private String typeRunner = "Человек";

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    public Human() {

        this.runSpeed = 10;
        this.restTime = 15;

    }

    public Human(int runSpeed, int restTime) {

        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + " " + "бегает со скоростью " + runSpeed + " " + "км/ч" );
        rest();

    }

    public void rest() {
        System.out.println(typeRunner + " " + "отдыхает " + restTime + " " + "минут" );
    }

}
