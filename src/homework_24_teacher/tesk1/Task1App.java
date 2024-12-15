package homework_24_teacher.tesk1;


/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */

/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.

Реализуйте класс Triathlete,
который будет реализовывать оба интерфейса (implements).

Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class Task1App {
    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete();
        triathlete.run();
        triathlete.swim();

        if (triathlete instanceof Swimmer) {  //
            Swimmer swimmer = (Swimmer) triathlete;
            swimmer.swim();
        }
//
//        Swimmer athlete = new Triathlete();  // создаём нового атлета (Swimmer)
//        athlete.swim();                      // можем вызвать только swim

        if (triathlete instanceof Runner) {    // проверяем можно ли триатлета назвать (Runner- бегуном)
            Runner runner = (Runner) triathlete;
            runner.run();                    // вызываем метод run
        }


    }
}