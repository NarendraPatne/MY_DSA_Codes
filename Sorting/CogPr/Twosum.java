import java.util.HashSet;

public class Twosum {
    public static void main(String[] args) {
        int arr[]={5,8,3,9};
        HashSet<Integer>set=new HashSet<>();
        int target=13;
        for(int x:arr)
        {
            int diff=target-x;
            if(set.contains(diff))
            {
                System.out.println("Two Sum Pair:"+x+"+"+diff+"="+target);
            }
            set.add(x);
        }
    }
}
