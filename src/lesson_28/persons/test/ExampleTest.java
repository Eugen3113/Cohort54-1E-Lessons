package lesson_28.persons.test;

import lesson_27.enums.days.Day;
import lesson_28.persons.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*; // Assertions -горела красным.Нав курсор или на красн лампочку потом:Add library....
                                                  // * -подгружаю в этот класс( Assertions) все статические методы
                                                  // (*)навёл мышкой на Assertions и Alt + Enter, выбрать Add.... (стр.42)
class ExampleTest {


    // Метод, помеченный @BeforeEach будет выполняться перед КАЖДЫМ тестовым методом
    @BeforeEach   //BeforeEach - перед каждым
    void setUp() {
        System.out.println("Метод @BeforeEach");
    }
    /*
    @BeforeEach - будет выполняться перед КАЖДЫМ тестовым методом
    @BeforeAll - метод выполнится только один раз перед выполнением первого теста (требует static)
    @AfterEach - будет выполняться после КАЖДОГО тестовым методом
    @AfterAll - метод выполнится только один раз после выполнение последнего теста (требует static)
    @Disabled - указывает, что тест отключен и выполнять метод не требуется
     */


    // Указывает, что метод является тестовым. Таким образом JUnit знает,
    // что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition() {
        System.out.println("Test addition");

        int result = 2 + 2;

        // Методы проверки утверждений
        // принимает   (ожидаемое, фактическое)значение. строка 41.
        // assertEquals(expected, actual)
        Assertions.assertEquals(4, result); // проверяет равны ли два значения   // Test addition- ok
        assertNotEquals(9, result); // тест будет пройден, если "неожидаемый результат" не равен фактическому
        assertTrue(result >= 4); // проверяет, что условие верно (возвращает true)
        assertFalse(result > 4); // проверяет, что условие ложно (условие возвращает false)
        assertNull(null); // Проверяет, что объект равен null
        assertNotNull("String"); // Проверяет, что объект не равен null
    }

    @Disabled  // тест Отключен и выполнять метод не требуется
    @Test
    public void emptyTest() {
        System.out.println("Empty test");
        // Пустой тестовый метод считается успешно пройденным,
        // Т.к. в методе нет ложного утверждения
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9, 11}) //@ValueSource-источник данных  --принимает массив intов
    public void testNumbers(int number) {
        System.out.println("number = " + number);
        assertTrue(number > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"}) //@ValueSource -принимает массив stringов
    public void testFruit(String fruit) {
        System.out.println("fruit = " + fruit);
        assertTrue(fruit.length() > 2);
    }

    //    apple,1
//    banana,2
    // CSV - Comma-Separated-Value
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})         // @CsvSource - принимает string,int, ...
    void testWithCsvSource(String fruit, int rank) {           // rank- число
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // Источник данных файл в формате CSV
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testWithCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    // Источник данных Enum
    @ParameterizedTest
    @EnumSource(Day.class)    // дни недели Enums- константы
    void testEnums(Day day) {
        System.out.println("day = " + day);
        assertNotNull(day);
    }

    @ParameterizedTest
    @MethodSource("testDataString")   // @MethodSource -источник данных.("testDataString")- название метода
    public void testWithMethodSource(String argument) {
        System.out.println("argument = " + argument);
        assertNotNull(argument);
    }
           // Stream- набор значений, который можно перебирать(массив)
    static Stream<String> testDataString() {
        return Stream.of("apple", "banana", "cherry"); // в методе .of перечисляю значения
    }

    static Stream<Integer> testInteger() {
        return Stream.of(1, 5, 6, 7, 78, 8);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")   // класс Arguments - может принимать различные наборы данных,аргументов
    void testMethodSource2(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(isEquals, result == expected);
    }

    static Stream<Arguments> testDataArguments() {    // класс Arguments - может принимать различные наборы данных
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(Person person, String email) {
        System.out.println("person = " + person);
        System.out.println("email = " + email);
        System.out.println("================\n");
    }

    static Stream<Arguments> testPersonsData() {
        Person person = new Person("test@mail.net", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new1234@mail.net"),
                Arguments.of(new Person("invalid.email.com", "password"), "mail.test.com")
        );
    }


}