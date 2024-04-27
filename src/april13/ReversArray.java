package april13;

public class ReversArray {
    //arr = {10,20,30,40,50,60.70}
    public static void reversArray(int[] arr){
        int temp;
        for (int i =0 ; i<arr.length/2 ; i++) {
            temp = arr[i];//swapping
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("after reversing: ");
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        reversArray(arr);
    }
}
