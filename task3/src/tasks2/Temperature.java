package tasks2;

import java.io.IOException;
import java.util.Scanner;

public class Temperature {
    public static void findTemperatureConditions() {

        Scanner scanner = new Scanner(System.in);
        int t;
        while (scanner.hasNextInt())  {
             t = scanner.nextInt();
            if (t > -20 && t <= -5) {
                System.out.println("Normal");
            } else if (t > -5) {
                System.out.println("Warm");
            } else {
                System.out.println("Cold");
            }
        }
    }
}


