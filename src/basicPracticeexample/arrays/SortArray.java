package basicPracticeexample.arrays;

import java.util.Arrays;

public class SortArray {
    int temp=0;

    public void sortWithForLoop(int[] num){
        System.out.println("Sorted Array is: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j]=temp;
                }

            }
            System.out.println(num[i]);
        }
    }


    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};

//        Arrays.sort(number);
//        System.out.println("the sorted array: ");
//        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i]);
//        }
//        Arrays.stream(number);
//        System.out.println("the sorted array using stream: ");
//        for (int j = 0; j < number.length; j++) {
//            System.out.println(number[j]);
//        }

        //calling method to sort array
        SortArray sortArray = new SortArray();
        sortArray.sortWithForLoop(number);
    }
}
