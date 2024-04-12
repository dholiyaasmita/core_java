import java.util.Scanner;

public class IfElseLoop3 {
    // check if year is leap year or not   // year%4
    //print all leap years in next 100 years.
    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you like: ");
        year = sc.nextInt();


        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){

        }


    }
}
