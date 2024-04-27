package april6;

public class DemoRectangle {
    double area,perimeter;
    double width;
    double length;

    DemoRectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public double calculateArea(){
        area = width*length;
        return area;
    }

    public double calculatePerimeter(){
        perimeter = 2 * (width+length);
        return perimeter;
    }



}
