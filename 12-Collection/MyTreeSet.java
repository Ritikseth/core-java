// This implementation provides guaranteed log(n) time cost for basic operations(add, remove and contains)
import java.util.*;

class Point implements Comparable{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(x="+x+", y="+y+")";
    }

    public int compareTo(Object o){
        Point p = (Point)o;
        if(this.x<p.x) 
            return -1;
        else if(this.x>p.x) 
            return 1;
        else if(this.y<p.y) 
            return -1;
        else if(this.y>p.y) 
            return 1;
        else return 0;
    }
}

class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
    
        ts.add(25);
        System.out.println(ts.ceiling(55)); // if 55 is not present in tree then print the nearest bigger number in the tree
        System.out.println(ts.floor(55)); // if 55 is not present in tree then print the nearest smaller number in the tree
        System.out.println(ts);

        TreeSet<Point> ts1 = new TreeSet<>();
        ts1.add(new Point(1,1));
        ts1.add(new Point(5,5));
        ts1.add(new Point(5,2));
        System.out.println(ts1);
    }
}
/* 
Constructor and Description
1. TreeSet()
Constructs a new, empty tree set, sorted according to the natural ordering of its elements.
2. TreeSet(Collection<? extends E> c)
Constructs a new tree set containing the elements in the specified collection, sorted according to the natural ordering of its elements.
3. TreeSet(Comparator<? super E> comparator)
Constructs a new, empty tree set, sorted according to the specified comparator.
4. TreeSet(SortedSet<E> s)
Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set.
*/