package task5;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void execute() {
        int[][] array = {{2, 8, 7,},
                         {3, 4, 5}};
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                summa += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов в массиве будет равна = " + summa);
    }
}
