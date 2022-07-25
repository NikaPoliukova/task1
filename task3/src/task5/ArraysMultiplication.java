package task5;

import java.util.Arrays;

public class ArraysMultiplication {
    public static void execute() {
        System.out.println("Умножение двух матриц");
        int[][] arrayOne = {{1, 0, 0, 0},
                            {0, 1, 0, 0},
                            {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3},
                            {1, 1, 1},
                            {0, 0, 0},
                            {2, 1, 0}};
        int[][] arrayNew = new int[3][3];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int u = 0; u < arrayTwo[0].length; u++) {
                for (int j = 0; j < arrayOne[0].length; j++) {
                    arrayNew[i][u] += arrayOne[i][j] * arrayTwo[j][u];
                }
            }
        }
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo[0].length; j++) {
                System.out.print(arrayNew[i][j] + " ");
            }
            System.out.println();
        }
    }
}

