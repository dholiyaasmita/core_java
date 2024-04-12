import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LotterySystem {
//    Lottery System
//    You ask user to enter a number  1-100   ,    55- Lucky Number
//1.   10 -- Sorry , Try again
//2. 20 --- Sorry Try again
//3. 55 -- You won $50000.

    public static void main(String[] args) {
        int n=100;
        int luckyNumber=55;

        System.out.println("Welcome to my lottery system!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice of your number: ");
        int input = scanner.nextInt();

        //Using if else
//        if (input==luckyNumber){
//            System.out.println("you won $500.");
//        }else{
//            System.out.println("sorry try again!!!");
//        }

        // Using break
        if (input==luckyNumber){

        }

    }

}
