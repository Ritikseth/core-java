import java.lang.*;
import java.util.*;

class DisplayData {
    public void display(String str) {

        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}

class MyThread1 extends Thread {
    DisplayData d;

    MyThread1(DisplayData d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello World ");
    }
}

class MyThread2 extends Thread {
    DisplayData dt;

    MyThread2(DisplayData d) {
        dt = d;
    }

    public void run() {
        dt.display("Welcome All");
    }
}

class Synchronisation {
    public static void main(String[] args) {
        DisplayData dt = new DisplayData();
        MyThread1 t1 = new MyThread1(dt);
        MyThread2 t2 = new MyThread2(dt);
        t1.start();
        t2.start();
    }
}
