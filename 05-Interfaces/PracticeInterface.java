import java.lang.*;
import java.util.*;

class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Sending sms");
    }
}

interface ICamera {
    void click();

    void record();
}

interface IMusicPlayer {
    void play();

    void stop();

}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videocall(){
        System.out.println("Smart Phone video calling");
    }

    // ignoring override annotation(writing would be a good practice)
    public void click() {
        System.out.println("Smart Phone Clicking Photo");
    }

    public void record() {
        System.out.println("Smart Phone recording video");
    }

    public void play() {
        System.out.println("Smart Phone playing music");
    }

    public void stop() {
        System.out.println("Smart Phone stopped playing music");
    }
}

class PracticeInterface {
    public static void main(String args[]) {
        IMusicPlayer imp = new SmartPhone();
        imp.play();
        imp.stop();
        SmartPhone sp = new SmartPhone();
        sp.play();
        sp.record();
        sp.call();

    }
}
