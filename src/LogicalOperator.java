public class LogicalOperator {
    public static void main(String[] args) {
        int num1=20;
        int num2=10;
        int num3=25;
        int num4=20;

        System.out.println(num1 > num2 && num1 < num2);  // false
        System.out.println(num1 >= num2 && num1 < num2); //false
        System.out.println(num1 > num2 && num1 <= num3);//true
        System.out.println(num1 != num2 && num1 < num4);//false
        System.out.println(num1 > num2 || num1 < num2);//true
        System.out.println(num1 > num4 || num1 < num2);//false
        System.out.println(num1 <= num4 || num1 >= num4);//true
        System.out.println(num1 > num4 || num2 < num2);//false
    }
}
