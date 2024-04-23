package basicPracticeexample.arrays;

import java.util.Arrays;

public class FindMaxAndMinElement {
    //find the maximum element and Minimum element in array.
    // number[] = 10,30,43,54,23,543,43,32
    int[] number =  {10,30,43,54,23,543,43,32};

    int max = number[0];
// Iterative way
    public void findMaxElement(){
        for (int i = 0; i < number.length; i++) {
            if (number[i]>max)
                max = number[i];
        }
        System.out.println("the max number of element is: "+max);
    }

// Arrays.sort method
    public void findMaxArrayEle(){
        Arrays.sort(number);
        //System.out.println("the max element in array using Arrays.stream.max: "+ Arrays.stream(number).max());
        System.out.println("the maximum element in number array is: "+ number[number.length-1]);
        System.out.println("the minimum element in number array is: "+ number[0]);
    }

    // find min value

    public void findMinElement(){
        for (int i = 0; i < number.length; i++) {
            if (number[i]<max)
                max = number[i];
        }
        System.out.println("the max number of element is: "+max);
    }

    public static void main(String[] args) {
        FindMaxAndMinElement findMaxAndMinElement = new FindMaxAndMinElement();
        //max element
        findMaxAndMinElement.findMaxElement();
        findMaxAndMinElement.findMaxArrayEle();

        //min element
        findMaxAndMinElement.findMinElement();


    }
}
