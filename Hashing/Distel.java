import java.util.HashSet;

public class Distel {
    public static int countDistEl(int arr[])
    {
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr)
        {
            set.add(x);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        System.out.println(countDistEl(arr));
    }
}
