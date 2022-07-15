package task4;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void executeTask1() {
        int[] array = {1, 3, 5, 8, 4, 6, 4, 7};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] result = findAndDeleteElement(array, number);
        if (result.length == array.length) {
            System.out.println("Такого элемента нету");
        } else {
            System.out.println(Arrays.toString(result));
        }
    }

    private static int[] findAndDeleteElement(int[] arr, int number) {
        int count = 0;
        for (int element : arr) {
            if (element == number) {
                count++;
            }
        }
        if (count < 1) {
            return arr;
        }
        int[] arr2 = new int[arr.length - count];
        int i = 0;
        for (int element : arr) {
            if (element != number) {
                arr2[i] = element;
                i++;
            }
        }
        return arr2;
    }
}
