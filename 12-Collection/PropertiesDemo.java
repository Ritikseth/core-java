import java.util.*;
import java.io.*;

// inherited from hashtable, but key as well as value can only be String and nothing else
class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows 10");
        p.setProperty("Model", "Latitude");

        p.storeToXML(new FileOutputStream("../Extra/PropertiesDemo.xml"), "Laptop");
        // p.loadFromXML(new FileInputStream("../Extra/PropertiesDemo.xml"), "Laptop");
        // p.load(new FileInputStream("../Extra/PropertiesDemo.txt"), "Laptop");
    }
}
