package april13;

public class SumOfArray {
    //sum of array
//    integer array --->arr = {23,44,23,52,54,23,87,87}
    public static void main(String[] args) {
        int[] arr= {23,44,23,52,54,23,87,87};

        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
