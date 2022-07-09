package tasks2;

import java.io.IOException;
import java.util.Scanner;

public class Temperature {
    public static void findTemperatureConditions() {

        Scanner scanner = new Scanner(System.in);
        String inputString;
        while (!((inputString = scanner.next()).equals("exit"))) {
            int temperature = Integer.parseInt(inputString);
            if (temperature > -20 && temperature <= -5) {
                System.out.println("Normal");
            } else if (temperature > -5) {
                System.out.println("Warm");
            } else {
                System.out.println("Cold");
            }
        }
    }
}


