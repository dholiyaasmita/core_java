import java.util.Scanner;

public class IfElseLoop2 {
    // number is even and odd
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you like: ");
        number = sc.nextInt();


        if (number%2 == 0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
}

