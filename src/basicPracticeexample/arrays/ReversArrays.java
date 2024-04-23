package basicPracticeexample.arrays;

public class ReversArrays {
//    number[] = 10,30,43,54,23,543,43,32
//    1.Reverse the array

    int temp;
    public void reverseArray(int[] number){
        for (int i = 0; i < number.length/2 ; i++) {
            temp=number[i];
            number[i]=number[number.length-i-1];
            number[number.length-i-1]=temp;
        }
        for (int j = 0; j < number.length; j++) {
            System.out.println("reversed array is: "+number[j]);
        }

    }
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};
        ReversArrays reversArrays = new ReversArrays();
        reversArrays.reverseArray(number);
    }
}
