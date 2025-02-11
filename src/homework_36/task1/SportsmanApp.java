package homework_36.task1;


/*
1.Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).

2.Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.

3.Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.

4.В методе main создайте массив из нескольких объектов Sportsman.

5.Отсортируйте его с использованием:

   * естественного порядка, определенного в Comparable,
   * данного класса Comparator,
   * анонимного класса Comparator для сортировки по третьему полю (например, age).
6.Выведите каждый вариант отсортированного массива в консоль.
 */

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[4];

        sportsmen[0] = new Sportsman("Steven", 25, 100);
        sportsmen[1] = new Sportsman("Alexander", 30, 60);
        sportsmen[2] = new Sportsman("Vasiliy", 48, 150);
        sportsmen[3] = new Sportsman("Peter", 36, 110);


        System.out.println("\n=========== Age ====================\n");
        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));
        System.out.println("\n=========== Name ====================\n");

        Arrays.sort(sportsmen, new SportNameComparator());
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n================ Score ===============\n");

        Arrays.sort(sportsmen, new SportsmanScoreComparator());
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n======== Anonymous ====================\n");

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {

                return s1.getName().compareTo(s2.getName());

            }

        });
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("===========");

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {       // сортировка по возрасту
            @Override
            public int compare(Sportsman s1, Sportsman s2) {         // по возрасту в порядке убывания
            int ageCompare = s2.getAge() - s1.getAge();              // сравнение возрастов


            if (ageCompare != 0) {                                  // если возрасты не равны
                return ageCompare;                                  // сортировка по возрасту
            } else                                                   // если возрасты равны


                return s2.getName().compareTo(s1.getName());            // сортировка по имени


            }
        });

        System.out.println(Arrays.toString(sportsmen));

        System.out.println("===============");


        Arrays.sort(sportsmen, new Comparator<Sportsman>() {     // сортировка по рейтингу
            @Override
            public int compare(Sportsman s1, Sportsman s2) {     // по рейтингу в порядке убывания
                int scoreCompare = s1.getScore() - s2.getScore();     // score - счёт
                if (scoreCompare != 0) {                          // если рейтингы не равны
                    return scoreCompare;
                } else {                                           // если рейтинги равны
                    return s2.getName().compareTo(s1.getName());   // сортировка по имени
                }
            }
        });
        System.out.println(Arrays.toString(sportsmen));


    }


}
