import java.util.LinkedList;;
public class Jcfll {
    public static void main(String[] args) {
        // Create LL: Datatype is in Java Wrapper Classes who wraps primitive data into objects: Integer/Float/Character/etc
        LinkedList<Integer>ll=new LinkedList<>();
        // LinkedList<Float>ll1=new LinkedList<>();
        // LinkedList<Character>ll2=new LinkedList<>();
        // Add node
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);
        // Remove node
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
