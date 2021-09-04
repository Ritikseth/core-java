import java.lang.*;
import java.util.*;

class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(){         // Default constructor, Present evenif we don't define it
        length = 0;
        breadth = 0;
    }
    public Rectangle(double l,double b){ //Parameterized constructor, Defined by us
        length = l;
        breadth = b;
    }
    public Rectangle(double s){         //Parameterized constructor, Defined by us
        length = breadth = s;
    }
    public double area(){
        return length *breadth;
    }
}
class Constructors {
    public static void main(String[] args){
        Rectangle r = new Rectangle(10.5,15);
        System.out.println("Area of the Rectangle is " + r.area());
    }
}
