package task5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayCube {
    public static void execute() {
        System.out.println("Введите число, которое увеличит каждый элемент на заданное число");
        Scanner scanner = new Scanner(System.in);
        int increaseValue = scanner.nextInt();
        int[][][] arrayCube = {{{1, 8, 3}, {2, 3, 4}},
                               {{2, 3, 7, 9}, {1}, {2, 3}}};
        for (int[][] array2D : arrayCube) {
            for (int[] array1D : array2D) {
                System.out.println();
                for (int item : array1D) {
                    System.out.print(item + increaseValue + " ");
                }
            }
        }
        System.out.println();
    }
}
