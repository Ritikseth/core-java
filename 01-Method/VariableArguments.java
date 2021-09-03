import java.util.*;
import java.lang.*;

public class VariableArguments {
    static void showList(int start, String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(start + ". " + names[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList(6, "Ramesh", "Suresh", "Keshav", "Smith", "John");
    }
}
