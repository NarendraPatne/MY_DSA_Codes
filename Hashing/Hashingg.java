import java.util.HashSet;
public class Hashingg {
    public static void main(String[] args) {
        // Declare
        HashSet<Integer>set=new HashSet<>();
        // Array
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        // Add
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
