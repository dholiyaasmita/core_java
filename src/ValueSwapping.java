public class ValueSwapping {
    public static void main(String[] args) {

        int x =20;
        int y =10;
        System.out.println("Before Swapping: ");
        System.out.println("value of x is: "+x);
        System.out.println("value of y is: "+y);

        System.out.println("After swapping: ");
        x = x+y;//x=30
        y = x-y;
        x = x-y;
        System.out.println("value of x is: "+x);
        System.out.println("value of y is: "+y);


    }
}
