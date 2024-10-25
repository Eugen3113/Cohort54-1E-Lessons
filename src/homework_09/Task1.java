package homework_09;
       /*
        Task 1
        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

        Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке,
        а начиная с этого индекса в обратном:

        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

        Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке
        Если флаг == false -> печатает массив в прямом порядке
         */

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};

        // Примеры вызова методов
        printArrayInReverse(array); // [7, 6, 3, 4, 1]
        System.out.println();

        printArrayWithIndex(array, 2); // [1, 4, 7, 6, 3]
        System.out.println();

        printArrayWithFlag(array, true); // [7, 6, 3, 4, 1]
        System.out.println();

        printArrayWithFlag(array, false); // [1, 4, 3, 6, 7]
        System.out.println();



    }
    // Метод распечатывает массив в обратном порядке
    public static void printArrayInReverse(int[] array) {
        printArrayInReverse(array, array.length - 1);
    }

    private static void printArrayInReverse(int[] array, int index) {
        if (index < 0) {
            System.out.print("]");
            return;
        }
        if (index == array.length - 1) {
            System.out.print("["); // Начинаем с открывающей скобки
        }
        System.out.print(array[index]);
        if (index > 0) {
            System.out.print(", ");
        }
        printArrayInReverse(array, index - 1);
    }

    // Метод, принимающий индекс
    public static void printArrayWithIndex(int[] array, int index) {
        printArrayWithIndex(array, index, 0);
    }

    private static void printArrayWithIndex(int[] array, int index, int currentIndex) {
        if (currentIndex < index) {
            if (currentIndex == 0) {
                System.out.print("["); // Начинаем с открывающей скобки
            }
            System.out.print(array[currentIndex]);
            if (currentIndex < index - 1) {
                System.out.print(", ");
            }
            printArrayWithIndex(array, index, currentIndex + 1);
        } else {
            printArrayInReverse(array, array.length - 1);
        }
    }

    // Метод с булевым флагом
    public static void printArrayWithFlag(int[] array, boolean flag) {
        if (flag) {
            printArrayInReverse(array);
        } else {
            printArrayInOrder(array);
        }
    }

    private static void printArrayInOrder(int[] array) {
        printArrayInOrder(array, 0);
    }

    private static void printArrayInOrder(int[] array, int index) {
        if (index < array.length) {
            if (index == 0) {
                System.out.print("["); // Начинаем с открывающей скобки
            }
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
            printArrayInOrder(array, index + 1);
        } else {
            System.out.print("]"); // Закрывающая скобка
        }
    }



}

/*
*Пример учителя:
*
public class Task1 {

    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        printReverseArray(array, 2);

        System.out.println("\nprintReverseArray(array);");
        printReverseArray(array);

        System.out.println("\nprintReverseArray(array, true): ");
        printReverseArray(array, true);

        System.out.println("\nprintReverseArray(array, false): ");
        printReverseArray(array, false);


    } // Methods area

    public static void printReverseArray(int[] array, boolean flag) {
        if (flag) {
            printReverseArray(array);
        } else {
            printReverseArray(array, array.length - 1);
        }
    }

    public static void printReverseArray(int[] array) {
        // Перебрать все индексы от большего к меньшему и вывести элементы
       printReverseArray(array, 0);
    }

    public static void printReverseArray(int[] arr, int index) {
        System.out.print("[");
        // Печатаю все элементы под индексами от 0 до index в прямой последовательности
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }
        // 2, 3, 4 -> 4, 3, 2
        // Печатаю все элементы под индексами от arr.length - 1 до index (вкл) в обратном порядке
        for (int i = arr.length - 1; i >= index ; i--) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
        }
    }



} // End class

 */