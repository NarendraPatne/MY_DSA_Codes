import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(30));
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
