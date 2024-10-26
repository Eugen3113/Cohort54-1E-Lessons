package homework_11;

/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumArray(arr);
        System.out.println("Сумма элементов массива: " + sum);

        double avarage = averageArray(arr);
        System.out.println("Среднее значение: " + avarage);


    } // Methods area



    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;

        }
        return sum;

    }

    public static double averageArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;

        }
        return (double) sum / arr.length;


    }

} // End class
