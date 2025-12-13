import java.util.HashMap;
import java.util.LinkedHashMap;

public class Freq {
    public static void main(String[] args) {
        int arr[]={4,3,12,3,4,5,5,6,6,9,4,4,3,2,1,1,1};
        HashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }   
        System.out.println(map);
    }
}
