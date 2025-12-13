import java.util.*;
public class Q13AbsDiffOEFruit {
    public static int countAbsDiff(String fruits)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:fruits.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(int count:map.values())
        {
            if(count%2==1)
            {
                maxOdd=Math.max(maxOdd,count);
            }else{
                minEven=Math.min(minEven,count);
            }
        }
        return Math.abs(maxOdd-minEven);
    }
    public static void main(String[] args) {
        System.out.println(countAbsDiff("aabbccc"));
        System.out.println(countAbsDiff("aabb"));
        System.out.println(countAbsDiff("aaaa"));
    }
}
