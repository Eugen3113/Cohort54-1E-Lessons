package lesson_28.persons;

import org.junit.jupiter.api.Test;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.12.2024
 */

public class Person { //подключаем ФРЕМВОРК, на название класса(Person) курсор,потом Alt+Enter, create test, ok,
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    vasya@gmail.com
    @asyagmail.com
    vasya@gmail.com
    vasya@gmail.net.de
    vasy12112a@gmail.net.de
    vasya@gmail.net.de
     */

    /*
    1. Должна присутствовать @ и только одна (done)
    2. Точка после собаки
    3. После последней точки должно быть минимум 2 символа
    4. Алфавит, цифры, '_', '-', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    5. Первый символ должен быть буквой
     */

    private boolean isEmailValid(String email) {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        if (email.indexOf('.', indexAt + 2) == -1) return false;

        // 3. После последней точки должно быть минимум 2 символа
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) { // Символ НЕ подходит
                return false;
            }
        }

        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) return false;

        if (!Character.isAlphabetic(email.charAt(0))) return false;

        return true;
    }

    /*
    Требования к паролю
    1. Длина >= 8
    2. Должна быть мин 1 маленькая буква
    3. Должна быть мин 1 большая буква
    4. Должна быть мин 1 цифра
    4. Должен быть мин 1 спец.символ "!%$@&*()[]"
     */

    /*
    4 переменный типа boolean
     boolean isDigit = true;
        boolean isLowerCase = false;
        Запускаю цикл
        И после цикла во всех 4-х должено быть true. - тогда вернуть true
        Иначе пароль проверку не прошел - вернуть false
     */

    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return false;
        }

        boolean isDigit = false;

        String symbols = "!%$@&*()[]";

        // альтернативный способ объявления пременных
        boolean[] result = new boolean[4]; // будут иметь значение- false, false, false, false

        for (int i = 0; i < password.length(); i++) {  // перебираю символы в пароли
            char ch = password.charAt(i); // получаю текущий символ
                 // Character - ch обёрточный класс
            if (Character.isDigit(ch)) result[0] = true; // если переменная ЦИФРА то -true
            if (Character.isUpperCase(ch)) result[1] = true; // если переменная с БОЛЬШОй буквы - true
            if (Character.isLowerCase(ch)) result[2] = true; // если переменная с МАЛЕНЬКОЙ буквы - true
            if (symbols.indexOf(ch) >= 0) result[3] = true; // если символ будет найден(чтото больше нуля
            // )
        }

        // Если хотя бы в одной переменной останется значение false,
        // то весь пароль не будет признана валидным = из метода вернется false
        return  result[0] && result[1] && result[2] && result[3];
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }





    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
