package lesson_28.persons;


/**
 * @author Sergey Bugaenko
 * {@code @date} 17.12.2024
 */

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person(" ", "asssSSS1$");

        person.setEmail("valid@email.com");
        System.out.println(person);
    }
}