package April6;

public class MainDemoRectangle {
    public static void main(String[] args) {
        DemoRectangle demoRectangle = new DemoRectangle(2,4.3);
        DemoRectangle demoRectangle1 =new DemoRectangle(5,5);
        DemoRectangle demoRectangle2 =new DemoRectangle(3.3,10);

        System.out.println("the area of rectangle is: "+ demoRectangle.calculateArea());
        System.out.println("the perimeter of rectangle is: "+demoRectangle.calculatePerimeter());

        System.out.println("the area of rectangle 1 is: "+ demoRectangle1.calculateArea());
        System.out.println("the perimeter of rectangle 1 is: "+demoRectangle1.calculatePerimeter());

        System.out.println("the area of rectangle 2 is: "+ demoRectangle2.calculateArea());
        System.out.println("the perimeter of rectangle 2 is: "+demoRectangle2.calculatePerimeter());
    }
}
