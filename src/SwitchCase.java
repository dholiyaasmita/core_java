import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Calculator");
        System.out.println("press 1 for Addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 for modulus");
        System.out.println("press 0 for exit");
        System.out.println("Enter your input: ");
        int calculator = scanner.nextInt();

        System.out.println("please enter your first input : ");
        double calVal1 = scanner.nextInt();
        System.out.println("please enter your second input : ");
        double calVal2 = scanner.nextInt();

        switch (calculator){
            case 1:
                double sum = calVal1+calVal2;
                System.out.println("Addition of both value is: "+sum);
                break;
            case 2:
                double sub = calVal1-calVal2;
                System.out.println("Subtraction of both value is: "+sub);
                break;
            case 3:
                double multi = calVal1*calVal2;
                System.out.println("Multiplication of both vlaue is: "+multi);
                break;
            case 4:
                double div = calVal1/calVal2;
                System.out.println("Division of both value is: "+div);
                break;
            case 5:
                double mod = calVal1%calVal2;
                System.out.println("Modules of both value is: "+mod);
                break;
            case 0:
                System.out.println("you have closed the calculator ");
                break;
            default:
                System.out.println("No Result found!!");
        }

    }
}
