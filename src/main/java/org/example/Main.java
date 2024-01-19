package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        FizzBuzz
//        Takes number as input
//        Returns Fizz with multiple of 3
//        Returns Buzz with multiple of 5
//        Returns FizzBUzz for mutliple of 3 & %
//        Else returns number
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = FizzBuzz(number);
        System.out.println(result);

    }
    public static String FizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        else {
            return String.valueOf(number);
        }
    }
}