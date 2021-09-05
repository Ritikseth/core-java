import java.lang.*;
import java.util.*;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius); // As parent class was having a parameterized constructor therefore we need to
                       // call it explicitly
        this.height = height;
    }

    public double volume() {
        return area() * height; // area method is inherited from Circle class
    }
}

class InheritanceBasic {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.13);
        Cylinder c2 = new Cylinder(5.13, 7);
        System.out.println("Area of Circle= " + c1.area());
        System.out.println("Volume of Cylinder= " + c2.volume());
    }
}