import java.util.HashMap;
public class HashMapp{
    public static void main(String[] args) {
        HashMap<Integer, String> hmap=new HashMap<>();
        hmap.put(11, "One");
        hmap.put(2, "Two");
        // Uses unique keys this will be used for updating the value of the repeated key
        hmap.put(2, "Four");
        hmap.put(34, "Three");
        // Unordered collection of key value pairs 
        System.out.println(hmap);
        System.out.println(hmap.remove(11));
        System.out.println(hmap);
        hmap.put(23, "smaple");
        System.out.println(hmap.get(23));
        System.out.println(hmap.containsKey(2));
        System.out.println(hmap.containsValue("Four"));
        System.out.println(hmap.size());
        System.out.println(hmap.isEmpty());
        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
        System.out.println(hmap.entrySet());
        hmap.clear();
        System.out.println(hmap);
    }
}