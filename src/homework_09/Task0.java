package homework_09;

/*
Task 0
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */


public class Task0 {
    public static void main(String[] args) {
        String inp = "Chanel One";  //создаю строку
        // String inp = "12358 hello";

        printLength(inp);            //вызываю метод printlength (26 строка)


        sayOlive();
        sayOlive();


    }// Methods area


    public static void printLength(String str) { //метод принимает строку str
        if (str != null) {      //проверяем чтобы str небыла равна null
            System.out.println(str.length());
        } else {
            System.out.println("Входящая строка равна null");
        }
    }

    public static void sayOlive() {
        System.out.println("Mercedes Benz Test");
    }

}// End class

/*
* Пример учителя:
*
public class Task0 {

    public static void main(String[] args) {
        String hello = "Hello";

        printStringLength(hello);
        printStringLength("Hello World!");
    } // End main

    public static void printStringLength(String string) {
        System.out.println(string.length());
    }

} // End class
*
 */


