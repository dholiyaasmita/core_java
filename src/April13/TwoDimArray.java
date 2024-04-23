package April13;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first array elements: ");
        num1 = scanner.nextInt();
        System.out.println("Enter the first array elements: ");

        num2 = scanner.nextInt();
        int[][] arr = new int[num1][num2];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr.length ; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
