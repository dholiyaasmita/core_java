package basicPracticeexample.strings;

import april20.inheritanceexample.Rbc;

import java.util.Scanner;

public class RevOrderOfWord {
    //Write a Java program that takes a sentence as input and reverses the order of words in it.
    // A word is defined as a sequence of non-space characters.
    // The program should maintain the order of characters within each word.
    public void revOrderOfWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String string = scanner.nextLine();
        String[] stringArr = string.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArr.length; i++) {
            stringBuilder.append(stringArr[stringArr.length-i-1]);
            stringBuilder.append(" ");
        }
        System.out.println("reverse sentence is: "+stringBuilder);
    }

    public static void main(String[] args) {
        RevOrderOfWord revOrderOfWord = new RevOrderOfWord();
        revOrderOfWord.revOrderOfWord();
    }
}
