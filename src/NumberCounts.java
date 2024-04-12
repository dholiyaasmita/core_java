import java.util.Scanner;

public class NumberCounts {
    public static void main(String[] args) {
        int counter=1;
        int sum = 0;
        //while loop
        while (counter<=10){
            System.out.println("the given number is: "+counter);
            sum = sum+counter;
            counter++;
        }
        System.out.println("the sum of the numbers: "+sum);

        //Do While loop
        System.out.println("using Do While loop");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        do{
           // System.out.println("the given number: "+counter);
            sum = sum+counter;
            counter++;
        }while (counter<=n);
        System.out.println("the sum of the numbers: "+sum);
    }
}
