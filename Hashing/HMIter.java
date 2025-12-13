import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMIter {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India",45);
        map.put("Japan",54);
        map.put("Nepal",56);
        map.put("Russia",59);
        System.out.println(map);
        System.out.println(map.keySet());
        // Iteration: using set
        Set<String>keys=map.keySet();
        System.out.println("-----------------------------------");
        for(String key:keys)
        {
            System.out.println("Key:"+key+" Value:"+map.get(key));
        }
        System.out.println("-----------------------------------");
        // Get values
        for(int i:map.values())
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
        // Iteration: using lambda
        map.forEach((key,value)->{
            System.out.println("Key:"+key+" Value:"+value);
        });
        System.out.println("-----------------------------------");
        // using entryset : Best for DSA
        for(Map.Entry<String,Integer>entry:map.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+" Value:"+entry.getValue());
        }
    }
}
