import java.util.*;
import java.lang.*;

class WhiteBoard {
    String text;
    int noOfStudent = 0;
    int count = 0;

    void attendance() {
        noOfStudent++;
    }

    synchronized void write(String msg){
        System.out.println("Teacher is writing: "+msg);
        while(count!=0){
            try{wait();}catch(Exception e){}
        }
        text = msg;
        count=noOfStudent;
        notifyAll();
    }

    synchronized String read() {
        while(count==0){
            try{wait();}catch(Exception e){}
        }
        String t=text;
        count--;
        if(count==0){
            notify();
        }
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;

    Teacher(WhiteBoard wb) {
        this.wb = wb;
    }

    String[] msg = new String[4];{
    msg[0]="Java is a language";
    msg[1]="It is OOPs";
    msg[2]="It supports MultiThreading";
    msg[3]="end";
    }

    public void run(){
        for(String x:msg){
            wb.write(x);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

class Student extends Thread {
    WhiteBoard wb;
    String text,name;
    Student(WhiteBoard wb,String name) {
        this.name=name;
        this.wb = wb;
        wb.attendance();
    }

    public void run() {
        while(text!="end") {
            text=wb.read();
            System.out.println(name+": "+text);
            System.out.flush();
        }
    }
}

class ClassroomChallenge {
    public static void main(String[] args) {
        WhiteBoard w = new WhiteBoard();
        Teacher t = new Teacher(w);
        Student s1 = new Student(w,"Ram");
        Student s2 = new Student(w,"Smith");
        Student s3 = new Student(w,"Noob");
        Student s4 = new Student(w,"Sam");
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
