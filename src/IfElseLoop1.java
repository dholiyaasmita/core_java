import java.util.Scanner;

public class IfElseLoop1 {
    // number is negative or positive

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you like: ");
        number = sc.nextInt();
        sc.close();

        if (number>0){
            System.out.println("Number is positive.");
        }else{
            System.out.println("Number is negative.");
        }




    }




}
