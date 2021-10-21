public class FloatClass{

    public static void main(String[] args) {
        
        float a=12.5f;
        Float c=12.5f;
        Float b=-12.5f/0;
        Float d=(float)Math.sqrt(9);
        Float e=(float)Math.sqrt(-1);
        
        System.out.println(c.equals(a));
        System.out.println(b.isInfinite());
        System.out.println(Float.POSITIVE_INFINITY==b);
        System.out.println(b==Float.NEGATIVE_INFINITY);
        System.out.println(d.isNaN());
        System.out.println(d!=Float.NaN);
        System.out.println(e.isNaN());
        System.out.println(e!=Float.NaN);
    }
    
}