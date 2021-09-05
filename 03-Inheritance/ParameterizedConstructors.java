import java.lang.*;
import java.util.*;

class Parent {
    int x=10;
    Parent() {
        System.out.println("Non-Param of parent");
    }

    Parent(int x) {
        System.out.println("Param of parent " + x);
    }
}

class Child extends Parent {
    int x=20;
    Child() {
        System.out.println("Non-Param of child");
    }

    Child(int y) {
        super(y);
        System.out.println("Param of child");
    }

    Child(int x, int y) {
        super(x);
        System.out.println("2 param of child " + y);
    }
    void display(){
        System.out.println("Value of x in parent " + super.x);
        System.out.println("Value of x in Child " + x);   // here this.x can also be used
    }
}

class ParameterizedConstructors {
    public static void main(String[] args) {
        System.out.println("Object c1");
        Child c1 = new Child();
        System.out.println("Object c2");
        Child c2 = new Child(20);
        System.out.println("Object c3");
        Child c3 = new Child(10, 20);
        c1.display();
    }
}
