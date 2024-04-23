package basicPracticeexample.arrays;

public class SumOfArray {
    // find the sum of all the elements in array

    int[] number = {10,30,43,54,23,543,43,32};
    int sum =0;

    public void sumOfArray(){
        for (int i = 0; i < number.length; i++) {
            sum = sum+number[i];
        }
        System.out.println("Array of sum is: "+sum);
    }

    public static void main(String[] args) {
        SumOfArray sumOfArray = new SumOfArray();
        sumOfArray.sumOfArray();
    }
}
