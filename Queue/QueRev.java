import java.util.*;

public class QueRev {
    public static void reverseQueue(Queue<Integer>que)
    {
        Stack<Integer>s=new Stack<>();
        while(!que.isEmpty())
        {
            s.push(que.remove());
        }
        while(!s.isEmpty())
        {
            que.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.add(12);
        System.out.println(queue);
        reverseQueue(queue);
        System.out.println(queue);
    }
}
