import java.util.*;
import java.io.*;

class TokenizerDemo {
    public static void main(String[] args) throws Exception {
        String data = "name=Abhishek;address=delhi;country=india;dept=cse";
        // if \n is present in the data then it need not be included in the delimiter
        StringTokenizer stk = new StringTokenizer(data,"=;");

        String s;

        while(stk.hasMoreTokens()) {
            s = stk.nextToken();
            System.out.println(s);
        }

        System.out.println("\n");

        FileInputStream fis = new FileInputStream("../Extra/PropertiesDemo.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String data1 = new String(b);

        StringTokenizer stk1 = new StringTokenizer(data1,"=;");

        String s1;

        while(stk1.hasMoreTokens()) {
            s1 = stk1.nextToken();
            System.out.println(s1);
        }
        ArrayList<String> al = new ArrayList<>();
        StringTokenizer stk2 = new StringTokenizer(data1,"=;");
        while(stk2.hasMoreTokens()) {
            s1 = stk2.nextToken();
            al.add(s1);
        }
        al.forEach(System.out::println);
        // Iterator<String> itr = al.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
    }    
}
