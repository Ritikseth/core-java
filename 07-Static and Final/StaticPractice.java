import java.lang.*;
import java.util.*;

class Test {
    static {        // called upon creation of a new instance
        System.out.println("Block 3");
    }
    static {
        System.out.println("Block 4");
    }
}

class StaticPractice {
    static {
        System.out.println("Block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Test t = new Test();
    }

    static {
        System.out.println("Block 2");
    }
}
