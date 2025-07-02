import java.util.ArrayDeque;

public class ArrDque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adque=new ArrayDeque<>();
        adque.add(10);
        adque.offer(20);
        adque.offerFirst(30);
        adque.addLast(40);
        System.out.println(adque);
        System.out.println(adque.poll());
        System.out.println(adque.pollFirst());
        System.out.println(adque.pollLast());
        adque.offer(45);
        adque.offerFirst(25);
        System.out.println(adque);
        System.out.println(adque.peek());
        System.out.println(adque.peekLast());
    }
}
