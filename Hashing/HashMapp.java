import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("One", 1);
        map.put("One", 1);
        map.put("Two", 1);
        map.put("Three", 3);
        System.out.println(map);
        System.out.println(map.get("Two"));
        System.out.println(map.get("One"));
        System.out.println(map.containsKey("Three"));
        System.out.println(map.containsKey("Two"));
        System.out.println(map.remove("One"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
    }

}
