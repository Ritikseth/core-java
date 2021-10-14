import java.util.*;
import java.lang.*;

class MyThread extends Thread {
    public void run() {
        int count = 1;
        // try{
        // Thread.sleep(1000);
        // }
        // catch(Exception e){}
        while (true) {
            System.out.println(count++ + "My thread");
        }
    }
}

class ThreadMethod2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true); // Set the thread as deamon, so that it ends when main ends
        t.start();
        // try {
        // Thread.sleep(100); // making main to sleep 100millisec to test if making our
        // thread as deamon works
        // // or not
        // } catch (Exception e) {
        // }
        // Thread mainThread = Thread.currentThread(); // creating a reference for mainthread
        // try {
        // mainThread.join(); // joining the main thread to MyThread t
        // } catch (InterruptedException e) {}
        int count = 1;
        while (true) {
            System.out.println(count++ + "Main thread");
            Thread.yield(); // Making the main thread to wait for a while and give time for mythread to execute
                            // btw mythread was working fine, yield was given to just for testing purpose
        }
    }
}
