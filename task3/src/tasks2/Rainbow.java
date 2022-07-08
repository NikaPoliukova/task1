package tasks2;

import java.util.Scanner;

public class Rainbow {
    public static void findRainbowColor() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int month = scanner.nextInt();
            switch (month) {
                case 1:
                    System.out.println("Red");
                    break;
                case 2:
                    System.out.println("Orange");
                    break;
                case 3:
                    System.out.println("Yellow");
                    break;
                case 4:
                    System.out.println("Green");
                    break;
                case 5:
                    System.out.println("Blue");
                    break;
                case 6:
                    System.out.println("Dark blue");
                    break;
                case 7:
                    System.out.println("Violet");
                    break;
            }
        }
    }
}
