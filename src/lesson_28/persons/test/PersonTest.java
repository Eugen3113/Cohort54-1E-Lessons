package lesson_28.persons.test;

import lesson_27.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.12.2024
 */

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword); // добаваляем нового Person
    }

    @Test
    void testValidEmailSet() {    // установка тестирование валидного пароля
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);

        assertEquals(validEmail, person.getEmail()); // validEmail-ожидаемый результат ,person.getEmail()- фактический результат
        assertNotEquals(startEmail, person.getEmail()); //проверяю что startEmail был заменён на validEmail
    }

    /*
    1. Берем невалидный email
    2. Устанавливаем его сеттером персону
    3. Ожидаемый результат: invalidEmail установлен не будет
    4.
     */

    // testmail.net
    // test@@mail.net

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail, person.getEmail()); // invalidEmail- недолжен появиться у person(проверка)
        assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "1test@mail.net",
                "_test@mail.net",
                ".test@mail.net",
                "test+1@mail.net",
                "test,@mail.net"
        );
    }


}
