package homework_15_01;


/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
 */

public class Teacher {

    String name;
    String subject;
    String city;
    int experience;


    public Teacher(String teacherName, String subject, String city, int experience) {
        name = teacherName;
        this.subject = subject;
        this.city = city;
        this.experience = experience;

    }

    public Teacher() {

    }


    public void calls() {
        System.out.println("Я разговариваю по телефону");
    }

    public void write() {
        System.out.println("Я пишу");

    }

    public void resting() {
        System.out.println("Я отдыхаю");

    }

    public void info() {
        System.out.printf("Моё имя %s, предмет: %s, город: %s, стаж: %d\n", name, subject, city, experience);
    }


}
