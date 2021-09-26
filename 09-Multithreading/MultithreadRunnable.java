import java.util.*;
import java.lang.*;

class TestThread implements Runnable {      // we can also implement from runnable interface
    public void run() {     // run method must be overwritten
        int i=1;
        while (true) {
            System.out.println(i+"Hello");
            i++;
        }
    }
}

class MultithreadRunnable {
    public static void main(String[] args) {
        TestThread t = new TestThread();
        Thread th = new Thread(t);
        th.start();                   // calls the run method

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
