import java.lang.*;
import java.util.*;

class My {
    final int MIN = 1;
    static final int NORMAL;
    final int MAX;

    static {
        NORMAL = 5;
    }
    

    My() {
        MAX = 10;
    }
}

class FinalBasic {
    public static void main(String[] args){
        My m = new My();
    }
}

/* 
1. final variable cannot be modified
2. final method cannot be overridden
3. final class cannot be extended
*/

/*  3 ways to initialize final variables:-
1. directly initialize they at the time of declaration
2. Inside constructor
3. inside instance Block
// A static final variable can be initialized inside a static block
*/

 