package homework_41;

/*
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    static class Person {
        private String name;
        private int age;
        private String city;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;


        }

    }
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 25, "New York"),
                new Person("Jane", 30, "London"),
                new Person("Alice", 20, "Berlin"),
                new Person("Mark", 45, "Berlin"),
                new Person("Bob", 35, "Paris"),
                new Person("Charlie", 40, "Berlin"),
                new Person("Eugen", 48, "Mainz")
        );

        List<Person> filteredPeople = people.stream()
                .filter(p -> p.age > 25 && p.city.equals("Berlin"))
                //
                .collect(Collectors.toList());

        filteredPeople.forEach(System.out::println);
    }

}


