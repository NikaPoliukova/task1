package task4;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask1 {
    public static void executeTask() {
        System.out.println("������� �����,������� ������ ������ �������");
        Scanner scan = new Scanner(System.in);
        int size;
        while ((size = scan.nextInt()) < 6 || size > 10) {
            System.out.println("������� ������ ����� � ��������� �� 6 �� 10");
        }
        int[] arrayRandom = new int[size];

        System.out.println("������ ������");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = 2 + (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(arrayRandom));
        System.out.println("������� ������ ������ �� ����� ����� �����������");

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