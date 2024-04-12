import java.util.Scanner;

public class CalUsingWhile {
    public static void main(String[] args) {
        double firstNum,secondNum;
        int op;
        boolean yesorno= true;
        String again;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to my Calculator");
        while (yesorno) {

        System.out.println("press 1 for Addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 for modulus");

        System.out.println("Enter your input: ");
        op = scanner.nextInt();
        System.out.println("Enter the first number: ");
        firstNum = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        secondNum = scanner.nextDouble();


            switch (op) {
                case 1:
                    double sum = firstNum + secondNum;
                    System.out.println("Addition of both value is: " + sum);
                    break;
                case 2:
                    double sub = firstNum - secondNum;
                    System.out.println("Subtraction of both value is: " + sub);
                    break;
                case 3:
                    double multi = firstNum * secondNum;
                    System.out.println("Multiplication of both value is: " + multi);
                    break;
                case 4:
                    double div = firstNum / secondNum;
                    System.out.println("Division of both value is: " + div);
                    break;
                case 5:
                    double mod = firstNum % secondNum;
                    System.out.println("Modules of both value is: " + mod);
                    break;
                default:
                    System.out.println("No Result found!!");
            }

            System.out.println("Do you still want to continue? write y or n");
            //again = scanner.next().charAt(0);
            again = scanner.next();
            if (again.equalsIgnoreCase("yes")){
                yesorno =true;
            }else{
                yesorno = false;
                System.out.println("Enjoy your day");
            }
            

        }




    }
}
