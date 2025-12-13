import java.util.HashMap;

public class MajorityEl {
    public static void getMajorityElements(int arr[])
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        System.out.print("Majority Elements:");
        map.forEach((key,value)->{
            if(value>(arr.length/3))
            {
                System.out.print(key+" ");
            }
        });
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,5,5,5,1,3,1,5,1};
        getMajorityElements(arr);
    }
}
