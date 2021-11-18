import java.util.*;

class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        list.add(10);
        list.add(0, 5);
        list.addAll(1, list2);
        list.add(5, 70);

        list.addFirst(3);
        list.addLast(200);

        list.peekFirst();

        list.forEach(n -> show(n));
    }

    static void show(int n) {
        // if(n>60)
        System.out.println(n);
    }
}