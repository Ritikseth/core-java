import java.lang.*;
import java.util.*;

class Rectangle { // Read & Writable property
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }
}

class Student { // Read Only property
    private int roll;

    public int getRoll() {
        return roll;
    }
}

class Producer { // Write Only property
    private int sharedData;

    public void setSharedData(int d) {
        sharedData = d;
    }
}

class Properties {
    public static void main(String[] args) {

    }
}
