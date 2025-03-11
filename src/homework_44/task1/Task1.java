package homework_44.task1;

/*
Дан файл text.txt:

Lorem ipsum dolor sit amet, consectetur adipisicing.
Lorem ipsum dolor sit amet.
Lorem ipsum dolor sit amet, consectetur adipisicing elit.
Lorem, ipsum dolor.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.
Lorem, ipsum.
Lorem ipsum dolor sit amet consectetur adipisicing elit.
Lorem ipsum dolor sit.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!

Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt' и скопировать в него все данные из файла 'text.txt'
 */

import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/homework_44/Task1/text.txt");  // создаем объект класса File
        File copy = new File("src/homework_44/Task1/copy.txt");

        System.out.println(file.exists());
        System.out.println(copy.exists());

        System.out.println("==========================\n");

//        try {
//            java.nio.file.Files.copy(file.toPath(), copy.toPath());   // копирование текста из файла text в файл copy
//            System.out.println("Файл успешно скопирован!");            // без использования буферизации
//        } catch (IOException e) {                                        // или с использованием буферизации (по умолчанию)
//            System.out.println("Ошибка: " + e.getMessage());
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file));   // Создаем поток чтения файла text и поток записи в файл copy
             BufferedWriter writer = new BufferedWriter(new FileWriter(copy))) {     //

            String text;
            while ((text = reader.readLine()) != null) {                  //  Читаем файл построчно до конца файла и записываем в новый файл
                writer.write(text);
                writer.newLine();                                                  // Добавляем перенос строки
            }
            System.out.println("Файл скопирован!");

        } catch (IOException e) {                                                // Обрабатываем возможные исключения ввода-вывода
            System.err.println("Ошибка : " + e.getMessage());
        }
    }
}