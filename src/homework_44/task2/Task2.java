package homework_44.task2;

/*
Дан файл с историей поступлений денег на счета пользователей за некий период времени:

user1:2050
user2:1200
user1:1700
user3:1800
user1:1300
user4:2100
user2:750

Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:

less.txt

user2:1950
user3:1800

more.txt:

user1:5050
user4:2100
 */

// Мой код:

import homework_15_01.Teacher;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.BeanWriterProcessor;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.ObjectRowWriterProcessor;

import java.io.*;
import java.util.List;


public class Task2 {


    public static void main(String[] args) {

        String fileName = "src/homework_44/task2/text.txt";
        String lessFileName = "src/homework_44/task2/less.txt";
        String moreFileName = "src/homework_44/task2/more.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));  // поток чтения из файла
             BufferedWriter lessWriter = new BufferedWriter(new FileWriter(lessFileName));  // поток записи в файл    less
             BufferedWriter moreWriter = new BufferedWriter(new FileWriter(moreFileName))) {   // поток записи в файл  more

            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(":");
                String name = parts[0];
                int amount = Integer.parseInt(parts[1]);   // это первый элемент массива parts

                if (amount < 2000) {
                    name = parts[0];
                    lessWriter.write(name + ":" + amount + "\n");                 // amount - это второй элемент массива parts
                } else {

                    moreWriter.write(name + ":" + amount + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage()); // TODO что-то пошло не так :(  доработать

        }





    }
}

