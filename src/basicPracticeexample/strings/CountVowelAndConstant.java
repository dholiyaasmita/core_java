package basicPracticeexample.strings;

import java.util.Scanner;

public class CountVowelAndConstant {
    //Develop a program to count the number of vowels and consonants in a given string.

    public void countVowAndConst(String string){
        int vowel=0;
        int constant=0;
        String lowerStr = string.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            if (lowerStr.charAt(i)=='a'||lowerStr.charAt(i)=='e'||lowerStr.charAt(i)=='i'||
                    lowerStr.charAt(i)=='o'||lowerStr.charAt(i)=='u'){
                    vowel++;
            }else if (lowerStr.charAt(i)>='a'&&lowerStr.charAt(i)<='z'){
                    constant++;
            }
        }
        System.out.println("the number of vowels: "+vowel);
        System.out.println("the number of count: "+constant);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice of your String: ");
        String input = scanner.next();

        CountVowelAndConstant countVowelAndConstant = new CountVowelAndConstant();
        countVowelAndConstant.countVowAndConst(input);
    }
}
