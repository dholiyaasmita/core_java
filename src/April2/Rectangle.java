package April2;

public class Rectangle {
   /*
    Create a class called Rectangle
    variables - width , length

1. create a method to calcualte area
2. create a method to calculate perimeter

    main -- to call these methods to print area and perimeter.

            Circle
            radius
    area and circumeference.
    */

    double area,perimeter;

    public double calculateArea(double width,double length){
        area = width*length;
        return area;
    }

    public double calculatePerimeter(double width,double length){
        perimeter = 2 * (width+length);
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("the are of rectangle is: "+ rectangle.calculateArea(6.5,12));
        System.out.println("the perimeter of rectangle is: "+rectangle.calculatePerimeter(6.5,12));
    }

}
