package tasks2;

import java.util.Scanner;

public class PositiveNumbers {
    public static void findPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                if (number % 2 == 0) {
                    sum = sum + number;
                }
            }
            System.out.println("Sum = " + sum);
        }
    }
}
