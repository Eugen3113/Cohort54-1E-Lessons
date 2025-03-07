package lesson_29.equals;

import java.util.Objects;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.12.2024
 */

public class Employee {
    private String name;
    private String lastName;
    private int age;

    public Employee(String name, String lastName, int age) { // конструктор
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // ....................................................
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // Проверка на сравнение с самим собой
//        if (obj == null || this.getClass() != obj.getClass()) return false; // Проверка на совпадение классов (типов объектов)
//        Employee employee = (Employee) obj;
//
//        // Сравнение значимых полей

    ////        if (!this.name.equals(employee.name)) return false;  // if (если) - проверка на совпадение значимых полей
//        if (!Objects.equals(this.name, employee.name)) return false;
//        if (!Objects.equals(this.lastName, employee.lastName)) return false; // если объекты не равны, то возвращаем false
//        return  this.age == employee.age; // age примитивное значение, поэтому сравнение через ==
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Employee employee = (Employee) o;
//        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
//    }
    // ....................................................
                        // hashCode - хэш-код - уникальное значение для каждого объекта
    // генеоируем equals и hashCode с помощью IDEA:
    // Alt + Einfg -> equals() and hashCode() -> getClass() comparison .. -> next -> next ->  create

    @Override
    public final boolean equals(Object o) {  // final - нельзя переопределить, но можно переопределить в наследниках
        if (!(o instanceof Employee)) return false;             // if (если) - проверка на совпадение классов

        Employee employee = (Employee) o;  // приведение к типу Employee
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName); // if (если) - проверка на совпадение значимых полей
    }


    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + age;
        return result;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

