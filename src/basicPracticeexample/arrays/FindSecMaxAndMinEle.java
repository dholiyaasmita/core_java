package basicPracticeexample.arrays;

public class FindSecMaxAndMinEle {
    //find the second maximum
    //find the second minimum
    int[] number = {10,30,43,54,23,543,43,32};
    int max = number[0];//10
    int temp;
    public void findSecondMaxElement(){
        for (int i = 0; i < number.length; i++) {
            if (number[i]>max){
                temp = max;
                max = number[i];
            }else if(number[i]>temp){
                temp = number[i];
            }
        }
        System.out.println("the second max number of element is: "+temp);
    }

    public void findSecondMinElement(){
        for (int i = 0; i < number.length; i++) {
            if (number[i]<max){
                temp = max;
                max = number[i];
            }else if(number[i]<temp){
                temp = number[i];
            }
        }
        System.out.println("the second max number of element is: "+temp);
    }

    public static void main(String[] args) {
        FindSecMaxAndMinEle findSecMaxAndMinEle = new FindSecMaxAndMinEle();
        findSecMaxAndMinEle.findSecondMaxElement();
        findSecMaxAndMinEle.findSecondMinElement();
    }

}
