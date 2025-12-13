import java.util.HashMap;

public class Mfqel {
    public static void main(String[] args) {
        int arr[]={5,42,2,3,4,5,6,7,7,7,7,0};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int maxKey=-1,maxFreq=0;
        for(int key:map.keySet())
        {
            if(map.get(key)>maxFreq)
            {
                maxKey=key;
                maxFreq=map.get(key);
            }
        }
        System.out.println("Max Freq Element: "+maxKey+" With Freq: "+maxFreq);
    }
}
