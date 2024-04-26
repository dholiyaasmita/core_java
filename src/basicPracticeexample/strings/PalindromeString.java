package basicPracticeexample.strings;
import java.util.Scanner;

public class PalindromeString {
    //Create a program to check if a given string is a palindrome (reads the same backward as forward).

    public void checkPalindromeStr(String string){
        String revStr="";

        for (int i = string.length()-1; i >= 0; i--) {
            revStr = revStr+string.charAt(i);
        }

//        for (int i = 0; i < string.length(); i++) {
//            revStr = revStr+string.charAt(string.length()-i-1);
//        }
        if (string.equals(revStr)){
            System.out.println("Given string is palindrome string.");
        }else{
            System.out.println("Given string is not palindrome string.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice of your String: ");
        String input = scanner.next();
        PalindromeString palindromeString = new PalindromeString();
        palindromeString.checkPalindromeStr(input);


    }
}
