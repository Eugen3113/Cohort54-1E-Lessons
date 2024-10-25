package homework_11;

/*
Task 4 * (Опционально)
Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа.
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] array = {2, 2, 3, 6, 7, 2, 5};
        int[] res = removeElement(array, 2); // 2
        System.out.println(Arrays.toString(res));


    } // Methods


    public static int[] removeElement(int[] nums, int element) {
        // Сколько элементов мне нужно удалить?
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            }
        }

        int[] result = new int[nums.length - count];

        for (int i = 0, idx = 0; i < nums.length; i++) {
            if (nums[i] != element) {
                // надо записывать
                result[idx] = nums[i];
                idx++;
            }
        }
        return result;
        // int[] result = new int[];
    }

} // End
