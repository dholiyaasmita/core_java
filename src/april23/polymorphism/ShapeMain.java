package april23.polymorphism;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,3);
        rectangle.getArea();

        Circle circle = new Circle(3.5);
        circle.getArea();
    }
}
