package basicPracticeexample.strings;

import java.util.Scanner;

public class LongSubString {
    //Given a string, find the length of the longest substring without repeating characters. []

    public int longestSubString(String str){
        int maxLength=0;

        for (int right = 0, left =0; right < str.length(); right++) {
        int firstAppearance = str.indexOf(str.charAt(right),left);
        if (firstAppearance != right){
            left = firstAppearance+1;
        }
        maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.next();

        LongSubString longSubString = new LongSubString();
        int length = longSubString.longestSubString(input);
        System.out.println("longest substring length is: "+length);

    }
}
