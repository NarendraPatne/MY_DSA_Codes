import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioQue {
    public static void main(String[] args) {
        // Priority Queue by default implemented by MinHeap
        // Means it will always keep  the smallest element at the queue first position
        PriorityQueue<Integer>pqueue=new PriorityQueue<>();
        pqueue.offer(80);
        pqueue.offer(70);
        pqueue.offer(7);
        pqueue.offer(60);
        // It will always keep the smallest element among all the elements in the queue at the first position in the pqueue
        System.out.println(pqueue);
        System.out.println(pqueue.peek());
        pqueue.poll();
        System.out.println(pqueue);
        // Priority Queue using MaxHeap
        // we pass Comparator.reverseOrder() as argument to the priority queue constructor
        PriorityQueue<Integer> pquer=new PriorityQueue<>(Comparator.reverseOrder());
        pquer.offer(80);
        pquer.offer(70);
        pquer.offer(7);
        pquer.offer(60);
        // It will always keep the largest element among all the elements in the queue at the first position in the pqueue
        System.out.println(pquer);
        System.out.println(pquer.peek());
        pquer.poll();
        System.out.println(pquer);
        System.out.println(pquer.size());
        System.out.println(pquer.isEmpty());
        System.out.println(pquer.contains(7));
        pquer.clear();
        System.out.println(pquer);
    }
}
