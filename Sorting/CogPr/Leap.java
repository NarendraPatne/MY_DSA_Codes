import java.util.Arrays;
import java.util.HashSet;

public class Leap{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,6,6,7,7,8,9};
        HashSet<Integer>set=new HashSet();
        for(int i:arr)
        {
            set.add(i);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(set);
    }
}