package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This number is in the array?");
        System.out.println("Enter the number");
        ArrayElement.executeTask0();

        System.out.println("Remove numbers from array");
        System.out.println("Enter the number");
        RemoveElementFromArray.executeTask1();

        System.out.println("Find maximum, minimum and average value in an array");
        System.out.println("Enter the size of the array");
        ArrayRandom.executeTask2();
        System.out.println("Find the arithmetic mean of the elements of each array and compare");
        TwoArrays.executeTask3();

        System.out.println("Create an array of n random integers");
        System.out.println("Enter the size of the array");
        AdditionalTask1.executeTask();

        System.out.println("Create and populate an array");
        AdditionalTask2.replaceAllElementWithUnevenIndex();

        System.out.println("Create an array of strings and fill it with names");
        AdditionalTask3.sortNames();

        System.out.println("Bubble sort algorithm");
        AdditionalBubbleSort.sort();
    }
}


