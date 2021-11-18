//PriorityQueue works similarly to heap
import java.util.*;

class MyCom implements Comparator<Integer>{ // now it will work as a max heap
    public int compare(Integer o1, Integer o2){
        if(o1 < o2) return 1;
        else if(o1 > o2) return -1;
        else return 0;
    }
}

class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom()); // passing a comparator is optional

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek()); // displays the root element

        pq.forEach((x) -> System.out.println(x));
        pq.poll(); // will delete root

        System.out.println("After deletion: ");
        pq.forEach((x) -> System.out.println(x));
    }
}
