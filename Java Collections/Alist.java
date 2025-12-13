import java.util.ArrayList;

public class Alist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
