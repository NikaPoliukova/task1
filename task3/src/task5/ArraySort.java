package task5;

import java.util.Arrays;

public class ArraySort {
    public static void execute() {
        System.out.println("Отсортировать элементы в строках двумерного массива по возрастанию");
        int[][] array = {{2, 8, 7,},
                         {3, 4, 5},
                         {5, 8, 2}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Arrays.sort(array[i]);
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
