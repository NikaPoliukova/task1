package task4;

import java.util.Arrays;

public class AdditionalBubbleSort {
    public static int[] sort() {
        int[] array = {1, 3, 5, 8, 4, 6, 4, 7};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
