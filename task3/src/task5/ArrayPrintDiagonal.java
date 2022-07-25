package task5;

import java.util.Arrays;

public class ArrayPrintDiagonal {
    public static void execute() {
        System.out.println("¬ывести на консоль диагонали массива");
        int[][] array = {{2, 8, 7,},
                         {3, 4, 5},
                         {5, 8, 2}};
        findDiagonal(array);
        printDiagonal(array);
    }

    public static int[][] findDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i == j) || (i + j == array.length - 1) ? array[i][j] : 0;
            }
        }
        return array;
    }

    public static void printDiagonal(int[][] a) {
        for (int[] l : a) {
            for (int i : l) {
                System.out.print("\t" + i);
                System.out.println();
            }
        }
    }
}

