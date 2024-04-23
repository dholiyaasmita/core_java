package April13;

public class FindMaxArrayVal {
    //find max and min value
    //arr ={5,10,20,60,80}

    public static int findMaxValue(int[] arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
           // temp = arr[i];
            if (arr[i]>temp) temp=arr[i];

        }
        return temp;
        //System.out.println("the largest array number is: "+ temp);
    }

    public static int findMinValue(int[] arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            // temp = arr[i];
            if (arr[i]<temp) temp=arr[i];

        }
        return temp;
        //System.out.println("the largest array number is: "+ temp);
    }
    public static void main(String[] args) {
        int[]  arr = {10,23,45,60,5};
        System.out.println("the largest array number is: "+ findMaxValue(arr));

        System.out.println("the minimum array number is: "+ findMinValue(arr));

    }
}
