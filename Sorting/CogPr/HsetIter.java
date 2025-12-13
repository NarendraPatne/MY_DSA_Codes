import java.util.*;
public class HsetIter {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set);
        // Iteration on Set
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // Enhanced for loop
        for(Integer x:set)
        {
            System.out.print(x+" ");
        }
    }
}
