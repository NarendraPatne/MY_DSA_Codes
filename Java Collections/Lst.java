import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Lst {
    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n=arr.length;
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ls.add(0);
        }
        for(int i=0;i<n;i++)
        {
            ls.set(arr[i]-1,ls.get(arr[i]-1)+1);
        }
        return ls;
    }
    public static void freqCnt(int arr[])
    {
        HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            if(hash.containsKey(arr[i]))
            {
                c=hash.get(arr[i]);
            }
            hash.put(arr[i], c+1);
        }
        System.out.println(hash);
    }
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        ls.add(3);
        ls.add(2);
        ls.add(1);
        ls.add(3);
        ls.add(4);
        int arr[]={2,3,2,3,5};
        // ls.set(2, 23);
        freqCnt(arr);
        // System.out.println(frequencyCount(arr));
    }
}
