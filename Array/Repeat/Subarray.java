public class Subarray {
    public static void printSubarr(int arr[])
    {
        int subarr=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                System.out.print("[");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(" "+arr[k]+" ");
                }
                System.out.println("]");
                subarr++;
            }
        }
        System.out.println("Total Subarrays are:"+subarr);
    }
    public static void main(String[] args) {
        int arr[]={45,96,78,35,146};
        printSubarr(arr);
    }
}
