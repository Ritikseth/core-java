import java.lang.*;
import java.util.*;

class Circle {
    public double radius;

    public double area() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double perimeter() {
        double p = 2 * Math.PI * radius;
        return p;
    }
}

class Cylinder {
    double radius;
    double height;

    double surfaceArea() {
        return 2 * Math.PI * radius * height;
    }

    double lidarea() {
        return 2 * Math.PI * radius * radius;
    }

    double TotalSurfaceArea() {
        return (lidarea() + surfaceArea());
    }

    double Volume() {
        double vol = Math.PI * radius * radius * height;
        return vol;
    }
}

class Student {
    public String name;
    public String branch;
    public String usn;

    public float average(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        return total / 3;
    }
}

class Car {
    public String brand;
    public String regNo;
    public String color;
    public double fuelQty;

    public String toString() {
        return "\nBrand of the car:    " + brand+"\nColor of the car:    " + color+"\nFuel Quantity:       " + fuelQty+"\nRegistration number: " + regNo;
    }
}

class OopBasic {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5.6;
        System.out.println("Area of circle= " + c.area());
        System.out.println("Perimeter of circle= " + c.perimeter());
        Cylinder cy = new Cylinder();
        cy.radius = 4.3;
        cy.height = 5;
        System.out.println("Total SurfaceArea of cylinder= " + cy.TotalSurfaceArea());
        System.out.println("Volume of cylinder= " + cy.Volume());
        Student stud = new Student();
        stud.branch = "ISE";
        stud.name = "Ritik Seth";
        stud.usn = "1CR19IS118";
        System.out.println("Average marks of " + stud.name + " is " + stud.average(91, 99, 95));
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.color = "Black";
        c1.fuelQty = 85.7;
        c1.regNo = "KA-03-HA-2018";
        System.out.println("Car details are:-" + c1); //If we want to print the object itself by passing the object's reference then that class must have a toString() method
    }
}