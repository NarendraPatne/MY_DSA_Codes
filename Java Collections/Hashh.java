import java.util.HashSet;
import java.util.Set;

public class Hashh {
    public static void main(String[] args) {
        Set<Integer>hset=new HashSet<>();
        hset.add(12);
        hset.add(23);
        hset.add(41);
        hset.add(57);
        hset.add(35);
        hset.add(30);
        hset.add(30);
        // Unordered collection with unique values 
        System.out.println(hset);
        System.out.println(hset.size());
        System.out.println(hset.isEmpty());
        System.out.println(hset.contains(35));
    }
}
