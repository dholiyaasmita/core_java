package april23.polymorphism;

public class Circle extends  Shape{
    private double radius,area;
    final double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        area = radius*radius*PI;
        System.out.println("the area of circle is: "+area);
    }
}
