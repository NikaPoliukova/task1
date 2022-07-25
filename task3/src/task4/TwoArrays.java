package task4;


import java.util.Arrays;

public class TwoArrays {
    public static void executeTask3() {
        int[] firstArray = {5, 9, 0, 7, 5};
        int[] secondArray = {5, 8, 5, 2, 3};
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        countAverage(firstArray, secondArray);
    }

    private static int countAverage(int[] array1, int[] array2) {
        int average1 = 0;
        int average2 = 0;
        for (int i = 0; i < array1.length; i++) {
            average1 += array1[i] / array1.length;
            average2 += array2[i] / array2.length;
        }
        if (average1 > average2) {
            System.out.println("Arithmetic mean of the first array (" + average1 + ") more than the arithmetic mean " +
                    "second array (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Arithmetic mean of the first array (" + average1 + ") less than the arithmetic mean " +
                    "second array (" + average2 + ")");
        } else {
            System.out.println("Arithmetic averages of arrays are equal (" + average1 + ")");
        }
        return average1;
    }
}



