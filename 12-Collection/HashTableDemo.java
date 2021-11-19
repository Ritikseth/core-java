import java.util.*;

class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> ht = new Hashtable<>();
        ht.put("A", "Apple");
        ht.put("B", "Ball");
        ht.put("C", "Cat");
        ht.put("D", "Dog");
        ht.put("E", "Elephant");

        String s = (String) ht.get("C");
        System.out.println(s);

        Enumeration e = ht.elements();
        Enumeration k = ht.keys();

        while(e.hasMoreElements()) {
            System.out.println(e.nextElement()+" "+k.nextElement());
        }
        ht.compute("A", (key,value) -> value.toUpperCase());
        ht.computeIfAbsent("F", (key) ->"Fish");
        System.out.println(ht);
        
    }    
}
