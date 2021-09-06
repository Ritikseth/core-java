import java.util.*;
import java.lang.*;

abstract class Shape{
    Shape(){
        System.out.println("New shape created");
    }
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{
    float radius;
    Circle(float radius){
        this.radius = radius;
    }
    double perimeter() {
        return 2*Math.PI * radius;
    }
    double area() { 
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    float length;
    float breadth;

    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double perimeter() {
        return length+ breadth;
    }
    double area(){
        return length *breadth;
    }
}

class PracticeAbstract {
    public static void main(String[] args){
        Shape s1 = new Circle(5.6f);
        System.out.println(s1.perimeter());
        Shape s2 = new Rectangle(4.7f,8.3f);
        System.out.println(s2.area());
    }
}
