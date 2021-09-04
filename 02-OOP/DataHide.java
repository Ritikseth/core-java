import java.lang.*;
import java.util.*;

class Rectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return length + breadth;
    }
}

class DataHide {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10.5);
        r.setBreadth(5.5);
        System.out.println("Length of " + r.getLength() + "\nBreadth of " + r.getBreadth());
        System.out.println("Area of Rectangle= " + r.area());
        System.out.println("Perimeter of Rectangle= " + r.perimeter());
    }
}