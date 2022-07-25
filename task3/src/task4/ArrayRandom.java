package task4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRandom {
    public static void executeTask2() {
        Scanner scan = new Scanner(System.in);
        int sizeArray = scan.nextInt();
        int[] arrayRandom = new int[sizeArray];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = 3 + (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(arrayRandom));
        int[] result = findMinAndMaxValue(arrayRandom);
        System.out.println("Min value = " + result[0] + "; Max value = " + result[1] + "; Average value = " + result[2]);
    }

    private static int[] findMinAndMaxValue(int[] array) {
        int min = array[0];
        int max = array[0];
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            average += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + average);
        int[] minMaxAverageValue = new int[3];
        minMaxAverageValue[0] = min;
        minMaxAverageValue[1] = max;
        minMaxAverageValue[2] = average;
        return minMaxAverageValue;
    }
}


