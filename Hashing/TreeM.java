import java.util.TreeMap;
import java.util.TreeSet;

public class TreeM {
    public static void main(String[] args) {
        // Tree map Keys are Sorted
        TreeMap<String,Integer>tmap=new TreeMap<>();
        tmap.put("asdofij", 23);
        tmap.put("ysdofij", 97);
        tmap.put("esdofij", 97);
        tmap.put("xsdofij", 97);
        System.out.println(tmap);
        TreeSet<Integer>tset=new TreeSet<>();
        tset.add(78);
        tset.add(34);
        tset.add(67);
        tset.add(23);
        tset.add(69);
        System.out.println(tset);
    }
}
