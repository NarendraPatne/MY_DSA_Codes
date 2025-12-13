import java.util.Arrays;

public class Q36NthLargest {
    public static int getNthLargest(int N,int []arr)
    {
        Arrays.sort(arr);
        
        return arr[arr.length-N];
    }
    public static void main(String[] args) {
        int arr[]={1,7,3,5,7,8,12,34,53,23};
        System.out.println(getNthLargest(3, arr));
    }
}
