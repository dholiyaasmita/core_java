package basicPracticeexample.arrays;

import java.util.Arrays;

public class FindAveOfArray {

    int[] number = {10,30,43,54,23,543,43,32};
    double sum =0;

    public void aveOfArray(){
        for (int i = 0; i < number.length; i++) {
            sum = sum+number[i];
        }
        System.out.println("Array of average is: "+sum/ number.length);

        //using ave methos of arrays stream
        System.out.println("Using Arrays.stream of average method: "+ Arrays.stream(number).average());
    }

    public static void main(String[] args) {
        FindAveOfArray findAveOfArray = new FindAveOfArray();
        findAveOfArray.aveOfArray();
    }
}
