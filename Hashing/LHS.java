import java.util.LinkedHashSet;

public class LHS {
    public static void main(String[] args) {
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        set.add(4);
        set.add(8);
        set.add(9);
        set.add(9);
        set.add(4);
        set.add(2);
        set.add(3);
        System.out.println(set);
        set.remove(2); 
        set.forEach((val)->{
            System.out.print(val+" ");
        });
    }
}
