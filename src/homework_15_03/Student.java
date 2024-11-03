package homework_15_03;

public class Student {

    String name;
    String school;
    int age;

    public Student(String studentName, String school, int age) {
        name = studentName;
        this.school = school;
        this.age = age;
    }

    public Student() {

    }

    public void skippingclasses() {
        System.out.println("Я прогуливаю уроки");
    }

    public void writtingoff() {
        System.out.println("Я списываю");
    }

    public void sport() {
        System.out.println("Я занимаюсь спортом");
    }

    public void sick() {
        System.out.println("Я болею");
    }

    public void info() {
        System.out.printf("Моё имя %s, Название школы: %s, мой возраст: %d\n", name, school, age);
    }
}
