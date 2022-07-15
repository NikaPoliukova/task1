package task4;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask1 {
    public static void executeTask() {
        System.out.println("введите число,которое задаст размер массива");
        Scanner scan = new Scanner(System.in);
        int size;
        while ((size = scan.nextInt()) < 6 || size > 10) {
            System.out.println("¬ведите другое число в диапазоне от 6 до 10");
        }
        int[] arrayRandom = new int[size];

        System.out.println("массив создан");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = 2 + (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(arrayRandom));
        System.out.println("—оздаем другой массив из целых числе предыдущего");

        int i = 0;
        int count = 0;
        for (int evenValue : arrayRandom) {
            if (evenValue % 2 == 0) {
                count++;
            }
        }
        int[] arrayEvenNumbers = new int[count];
        for (int evenValue : arrayRandom) {
            if (evenValue % 2 == 0) {
                arrayEvenNumbers[i] = evenValue;
                i++;
            }
        }
        System.out.println(Arrays.toString(arrayEvenNumbers));
    }
}