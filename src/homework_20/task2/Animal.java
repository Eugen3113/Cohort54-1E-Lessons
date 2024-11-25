package homework_20.task2;

public class Animal {

    protected String name;  // Имя животного
    protected int age;      // Возраст животного

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal Name: " + name + ", Age: " + age;
    }


}
