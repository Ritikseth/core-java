import java.lang.*;
import java.util.*;

class HondaCity {
    static long price = 10;
    int a, b;

    static double OnRoadPrice(String city) {
        switch (city) {
            case "Delhi":
                return price + price * 0.1;
            case "Mumbai":
                return price + price * 0.09;
        }
        return price;
    }
}

class StaticBasic {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();
        System.out.println(HondaCity.price);
        System.out.println(h1.price);
        System.out.println(h2.price);
        h1.price = 20;
        System.out.println(h2.price);   // Now price of h2 is also 20
    }
}