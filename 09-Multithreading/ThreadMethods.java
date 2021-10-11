import java.util.*;
import java.lang.*;

// class Myrun implements Runnable {
//     public void run() {

//     }
// }

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY-2);
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
    }
}

class ThreadMethods {
    public static void main(String[] args) {
        Thread t = new Thread("New thread");
        // Thread t1 = new Thread(new Myrun(), "New thread");
        MyThread t2 = new MyThread("My thread 2");
        t2.start();
        t2.interrupt();
        System.out.println("ID: "+t2.getId());
        System.out.println("Name: "+t2.getName());
        System.out.println("Priority: "+t2.getPriority());
        System.out.println("State: "+t2.getState());
        System.out.println("Alive: "+t2.isAlive());

    }

}
