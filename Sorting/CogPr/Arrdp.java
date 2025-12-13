import java.util.*;

public class Arrdp {
    public static void main(String[] args) {
        int arr[]={4,5,5,6,7,8,8,9,4,32};
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr)
        {
            if(!set.add(x))
            {
                System.out.print(x+" ");
            }
        }
    }
}
