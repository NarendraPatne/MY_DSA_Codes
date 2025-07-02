public class ArrFun {
    public static void Update(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        Update(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
