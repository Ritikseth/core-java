class MyData{
    int value;
    boolean flag=true;
    synchronized public void set(int v){ //only producer is using this method, which is why synchronized won't work
        while(flag!=true){
           try{wait();}catch(Exception e){}
        }
        value = v;
        flag =false;
        notify();       
    }
    synchronized public int get(){
        int x=0;
        while(flag!=false){
            try{wait();}catch(Exception e){}
        }
        x=value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread{
    MyData data;

    Producer(MyData d){
        data = d;
    }
    public void run(){
        int count =1;
        while(true){
            data.set(count);
            System.out.println("Producer "+count);
            try{Thread.sleep(100);}catch(Exception e){}
            count++;
        }
    }
}

class Consumer extends Thread{
    MyData data;

    Consumer(MyData d){
        data = d;
    }
    public void run(){
        int value;
        while(true){
            value = data.get();
            System.out.println("Consumer "+value);
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}

class InterProcess{
    public static void main(String[] args) {
        MyData data = new MyData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}

/* what does synchronized do?
When one thread is executing a synchronized method for an object,
all other threads that invoke synchronized methods for the same 
object block (suspend execution) until the first thread is done with the object.

Second, when a synchronized method exits, it automatically establishes
a happens-before relationship with any subsequent invocation of a 
synchronized method for the same object. This guarantees that changes 
to the state of the object are visible to all threads */