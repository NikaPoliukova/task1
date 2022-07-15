package task4;

import java.util.Scanner;

public class ArrayElement {
    public static void executeTask0() {
        int[] array = {1, 3, 5, 8, 4, 6, 4, 7};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (ArrayElement.findArrayElement(array, number)) {
            System.out.println("number " + number + " is in the array ");
        } else {
            System.out.println("number " + number + " not in array ");
        }
    }
    private static boolean findArrayElement(int[] arr, int number) {

        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}

