import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionInter {
    public static void getUI(int arr1[],int arr2[])
    {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:arr1)
        {
            set.add(x);
        }
        for(int x:arr2)
        {
            if(set.contains(x))
            {
                list.add(x);
            }
        }
        for(int x:arr2)
        {
            set.add(x);
        }
        System.out.println(Arrays.toString(arr1)+"  "+Arrays.toString(arr2));
        System.out.println("Union of Arrays:"+set);
        System.out.println("Intersection of Arrays:"+list);
        
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9,6};
        int arr2[]={6,3,9,2,4,2};
        getUI(arr1, arr2);
    }
}
