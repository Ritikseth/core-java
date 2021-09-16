import java.lang.*;
import java.util.*;

class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float sugarQty;
    private float waterQty;

    static private CoffeeMachine my = null; // creating a reference,but private so that it cannot be from outside and
                                            // static so that it can be called from static method getInstance()

    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        sugarQty = 1;
        waterQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillMilk(float qty) {
        milkQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.15f;
    }

    static CoffeeMachine getInstance() {    
        if (my == null)     // so that only 1 instance is created
            my = new CoffeeMachine();
        return my;
    }
}

class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        if (m1 == m2 && m1 == m3)
            System.out.println("All 3 have same reference!!");
    }
}