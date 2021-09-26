import java.util.*;
import java.lang.*;

class TestThread extends Thread { // Every thread should be extended from tread class
    public void run() {           // run method must be overwritten
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

class MultithreadBasic {
    public static void main(String[] args) {
        TestThread t = new TestThread();
        t.start();                   // calls the run method

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}