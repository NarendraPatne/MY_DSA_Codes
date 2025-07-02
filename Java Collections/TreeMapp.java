import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        TreeMap<Integer,String>tmap=new TreeMap<>();
        tmap.put(1, "First");
        tmap.put(3, "Third");
        tmap.put(2, "Second");
        System.out.println(tmap);
        System.out.println(tmap.get(3));
        System.out.println(tmap.remove(2));
        tmap.put(4, "four");
        System.out.println(tmap);
        System.out.println(tmap.containsKey(4));
        System.out.println(tmap.isEmpty());
        System.out.println(tmap.size());
        System.out.println(tmap.firstKey());
        System.out.println(tmap.lastKey());
        tmap.put(5, "Five");
        tmap.put(6, "Six");
        System.out.println(tmap);
        System.out.println(tmap.tailMap(2));
        System.out.println(tmap.headMap(2));
        System.out.println(tmap.subMap(2,4));
    }
}
