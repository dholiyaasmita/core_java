import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        int counter=1;
        int result=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number which you like: ");
        int n = scanner.nextInt();

        System.out.println("the Number table is: "+n);
        while (counter<=10){
            result = n*counter;
            System.out.println(n+" X "+counter+" = "+result);
            counter++;
        }
    }
}
