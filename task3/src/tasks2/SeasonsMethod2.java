package tasks2;

import java.util.Scanner;

public class SeasonsMethod2 {
    public static void findSeasonByMonthNumberMethodTwo() {
        Scanner scanner = new Scanner(System.in);
        String exit = scanner.next();
        while (!(exit.equals("exit"))) {
            int month = scanner.nextInt();

            if (month == 12 || month == 1 || month == 2) {
                System.out.println("Winter");
            } else if (month == 3 || month == 4 || month == 5) {
                System.out.println("Spring");
            } else if (month == 6 || month == 7 || month == 8) {
                System.out.println("Summer");
            } else {
                System.out.println("Autumn");
            }
        }
    }
}

