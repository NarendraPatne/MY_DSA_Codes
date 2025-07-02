public class LargestNo {
    public static int LarNum(int arr[])
    {
        int l=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l)
            {
                l=arr[i];
            }
        }
        return l;
    }
    public static int LarNum1(int arr[])
    {
        int l=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<l)
            {
                l=arr[i];
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 400, 50, 60, 70, 516 };
        System.out.println("LArgest number is :"+LarNum(arr)+" and Smallest is "+LarNum1(arr));
    }
}
