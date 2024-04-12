import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Enter the value of y:" );
        int y = sc.nextInt();

        System.out.println("addition is: " + (x+y));
        System.out.println("subtraction is : "+(x-y));
        System.out.println("multiplication is: "+(x*y));
        System.out.println("Division is: "+(x/y));

    }
}
