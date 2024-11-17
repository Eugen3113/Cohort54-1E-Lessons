package lesson_17.cats;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.11.2024
 */

public class Cat {
    private String name;                   // поле
    private int age;                       // поле
    private int weight;                    // поле

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name) {              // set- установить значение поля
        if (name == null || name.isEmpty()) {       //проверка: имя== null  или имя пустое isEmpty(), тогда-
            System.out.println("Не корректное значение имени!");
            return;                                 // - прекращает работу метода
        }

        // имя подходит - установить в соответсвующее поле
        this.name = name;
    }

    public void setAge(int age) {
        if (age >=0 && age < 20) {
            // age - подходит - устанавливаем в свойства объекта
            this.age = age;
        }
    }

    public void eat() {
        System.out.println("Cat eating");
        weight++;
    }

    public String getName() {   // (get) геттеры-получить значение поля(взять)
        return name;
    }

    public int getAge() {
        return age;
    }

    // По какой-то причине я не хочу давать значение веса кота
    // Значит просто не пишу геттер для этого поля
//    public int getWeight() {
//        return weight;
//    }

    public void sayMeow() {
        System.out.println("Cat says meow");
        test();
    }

    protected void testProtected() {
        System.out.println("Cat protected");
    }

    private void test() {
        System.out.println("Test");
    }

    public String toString() {
        return "Cat " + name + ", age: " + age + ", weight: " + weight;
    }
}
