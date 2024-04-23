package april2;

public class Circle {
    double area,circumference;

    public double calculateArea(double radius){
        area = 3.14*radius*radius;
        return area;
    }

    public double calculateCircumference(double radius){
        circumference = 2 * 3.14 *radius;
        return circumference;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("the Area of circle is: "+circle.calculateArea(6));
        System.out.println("the Circumference of circle is: "+circle.calculateCircumference(6));
    }
}
