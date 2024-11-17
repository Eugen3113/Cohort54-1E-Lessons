//Написать класс Employee (Работник)
//
//У него должны быть поля имя, возраст, зарплата
//
//Инкапсулировать класс.
//
//Написать метод info() выводящий информацию о работнике.

//  Task 0

public class Employee {
    // Поля класса
    private String name;
    private int age;
    private double salary;



    // Конструктор
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Метод для вывода информации о работнике
    public void info(){
        System.out.printf("Employee %s, age: %d, salary: %.2f\n", name, age, salary);
    }


        public static void main(String[] args) {

            Employee employee = new Employee("Roberto", 58, 5000);

            employee.info();
        }


}