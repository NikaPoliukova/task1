package tasks2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Выводим на экран числа от 5 до 1");
        FiveNumbers.findFiveNumbersDownturn();

        System.out.println("Вывести на экран таблицу умножения");
        MultiplicationTable.countMultiplicationTable();

        System.out.println("введите на экран квадраты чисел от 10 до 20");
        SquareNumber.findSquareNumber();

        System.out.println("Выводила на экран последовательность с шагом 7");
        Subsequence.findSubsequence();

        System.out.println("Вывести 10 первых чисел последовательности");
        TenFirstNumbers.findTenFirstNumbers();

        System.out.println("Вывести на экран нечетные числа от 1 до 99.");
        UnevenNumbers.findUnevenNumbers();

        System.out.println("Выведите на экран первые 11 членов последовательности Фибоначчи");
        FibonacciSequences.finedFibonacciSequences();

        System.out.println("What is the color of the rainbow");
        System.out.println("Enter a number from 1 to 7, to exit enter \"exit\" ");
        Rainbow.findRainbowColor();

        System.out.println("Checking if a number is even or not");
        System.out.println("enter a number, to exit enter \"exit\"");
        EvenUnevenNumber.checkToEvenNumber();

        System.out.println(" Is it warm outside?");
        System.out.println("Enter the theme, to exit enter \"exit\"");
        Temperature.findTemperatureConditions();

        System.out.println("What season of the year does the month belong to? to exit enter \"exit\"");
        DifferentSeasons.findSeasonByMonthNumber();

        System.out.println("What season of the year does the month belong to (second method)? enter month name, to exit enter \"exit\"");
        SeasonsMethod2.findSeasonByMonthNumberMethodTwo();

        System.out.println("What is the final deposit amount? enter the amount and number of months, to exit enter \"exit\" ");
        Bank.accountSumDeposit();

        System.out.println("Determine if a number is positive or negative");
        System.out.println("enter a number, to exit enter \"exit\"");
        PositiveNumbers.findPositiveNumbers();
    }
}
