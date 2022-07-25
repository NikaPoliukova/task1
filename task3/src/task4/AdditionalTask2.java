package task4;

import java.util.Arrays;

public class AdditionalTask2 {
    public static void replaceAllElementWithUnevenIndex() {
        int[] array = {1, 3, 5, 8, 4, 6, 4, 7};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}

