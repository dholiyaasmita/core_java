package basicPracticeexample.strings;

import java.util.Scanner;

public class CountWords {
    // Write a Java program to count letters, spaces, numbers and other characters in an input string.
    public static void main(String[] args) {
        int lCount = 0, sCount=0, dCount=0, oCount=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string: " );
        String input = scanner.nextLine();
        char[] charArr = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(charArr[i])){
                lCount++;
            } else if(Character.isDigit(charArr[i])){
                dCount++;
            } else if (Character.isSpaceChar(charArr[i])) {
                sCount++;
            }else {
                oCount++;
            }
        }

        System.out.println("letter: " + lCount);
        System.out.println("space: " + sCount);
        System.out.println("number: " + dCount);
        System.out.println("other: " + oCount);

    }
}
