
public class Greatest {
    public static int searchG(int arr[])
    {
        // int great=arr[0];
        int great=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>great)
            {
                great=arr[i];
            }
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        System.out.println("Smallest :"+small);
        return great;
    }
    public static void main(String[] args) {
        int arr[]={10,20,320,40,50,60,59,9};
        System.out.println(" Greatest of Array is:"+searchG(arr));
    }
}
