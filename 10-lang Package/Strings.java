import java.lang.*;

class Strings {
    public static void main(String[] args) {
        String s1= new String ("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        StringBuilder s3 = new StringBuilder("Hello");

        s1=s1.concat(" World"); // s1 is a normal String,hence it's not mutable. Therefore new object is created and we have to reassign it to s1
        s2.append(" World"); // mutable String
        s3.append(" World"); //StringBuilder is same to StringBuffer, it's just not Thread-safe

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
