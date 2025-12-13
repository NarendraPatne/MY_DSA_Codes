import java.util.*;
public class DEque {
    public static void main(String[] args) {
        Deque<Integer>dque=new LinkedList<>();
        dque.add(5);
        dque.add(10);
        dque.add(15);
        System.out.println(dque);
        dque.addFirst(3);
        dque.addLast(20);
        System.out.println(dque);
        System.out.println(dque.getFirst());
        System.out.println(dque.getLast());
    }
}
