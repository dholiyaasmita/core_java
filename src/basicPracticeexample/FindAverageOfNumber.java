package basicPracticeexample;

import java.util.Scanner;

public class FindAverageOfNumber {
    // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static void main(String[] args) {
        int number1,number2,number3;
        double average;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        number2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        number3 = scanner.nextInt();

        average = number1+number2+number3 / 3;
        System.out.println("the average of the number: "+average);


    }
}
