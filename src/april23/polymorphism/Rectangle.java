package april23.polymorphism;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class Rectangle extends Shape{
    private double length,width,area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        area = length*width;
        System.out.println("the area of rectangle is: "+area);
    }
}
