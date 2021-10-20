import java.lang.*;
import java.util.*;

class WrapperClass {
    public static void main(String[] args) {
        // Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("16");

        Short f = Short.valueOf("123");

        Float g = 12.5f;
        float h = Float.valueOf("123.5");

        Double i = Double.valueOf(123.456);

        Character j = Character.valueOf('R');

        Boolean k = Boolean.valueOf("true");

        // Byte e = Byte.valueOf(17);// error "int cannot be converted to String"
        byte bb = 17;
        Byte e = Byte.valueOf(bb); // correct way
        // making bb(a primitive type) an object by wrapping/boxing

        float l = Float.valueOf("123.5");
        // float x = l.floatValue();
        float y=l;

        int m=10;
        Integer n=m; //primitive to object, known as autoboxing
        int p=n;//object to primitive, known as auto unboxing
         //int p=n.intValue();
    }
}
