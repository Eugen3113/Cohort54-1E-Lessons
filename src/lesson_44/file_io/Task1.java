package lesson_44.file_io;

import javax.sound.sampled.Line;
import java.io.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.03.2025
 */

public class Task1 {

    public static void main(String[] args) {

        /*
        Выберите какую-то папку (или создайте новую)
        Создайте в папке 10 файлов с именами: test_1.txt, test_2.txt, ... test_10.txt
        В каждый файл запишите соответсвующую строку: Java1, Java2 ... Java10
         */


        File path = new File("src/lesson_44/file_io/task_1");// папка для работы с файлами и директориями (создание, удаление, проверка свойств и т.р.)
        path.mkdirs();                                                // создание директории (папки) если она не существует

        for (int i = 1; i < 11; i++) {                                 // создание 10 файлов с именами: test_1.txt, test_2.txt, ... test_10.txt
            File file = new File(path, "test_" + i + ".txt");     // в каждый файл запишите соответсвующую строку: Java1, Java2 ... Java10

            try (FileWriter writer = new FileWriter(file)){                // открываем поток записи
                file.createNewFile();                                     // создаем новый файл
                writer.write("Java" + i + "\n");                          // записываем строку в файл
            } catch (IOException e) {                                     // обработка исключений
                throw new RuntimeException(e);                            // выбрасываем исключение
            }
        }

        /*
        Нужно найти файл, внутри которого есть строка "Java7"
        Проверьте в директории все файлы (получить список всех файлов в директории, залезть в каждый. Считать строку)
        Вывести имя/имена файлов, содержащих "Java7"
         */

        // Получить список файлов / директорий
        File[] files = path.listFiles(); // получить список всех файлов в директории path (получить список всех файлов в директории, залезть в каждый. Считать строку)

        for (File file : files) {             // проход по всем файлам в директории path

            // Проверяю, что работаю с файлом, а не директорией
            if (file.isFile()) {             // проверяю, что работаю с файлом

                // Код чтения из каждого файла

                // открываем поток чтения
                try (FileReader fileReader = new FileReader(file);        // открываем поток чтения файла file (поток чтения)
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                    // считываю строку из файла
                    String line = bufferedReader.readLine();                // считываю строку из файла file (поток чтения)

                    // Проверить содержимое строки
                    if (line != null && line.contains("Java7")) {                 // если строка не null и содержит "Java7"
                        System.out.println("Файл найден: " + file.getName()); //Файл найден: test_7.txt

                    }
//                    if (line != null && line.contains("Java7") && line.contains("7")) {
//                        System.out.println("Файл найден: " + file.getName() + " строка: " + line); //Файл найден: test_7.txt строка: Java7
//                    }


                } catch (FileNotFoundException e) {     // обработка исключений потоков чтения и записи файлов и директорий и их свойств
                    throw new RuntimeException(e);      // выбрасываем исключение
                } catch (IOException e) {               // обработка исключений потоков чтения и записи файлов и директорий и их свойств
                    throw new RuntimeException(e);      // выбрасываем исключение
                }
            }

        }


    }
}

