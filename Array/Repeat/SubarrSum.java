public class SubarrSum{
    public static void subarrSum(int arr[])
    {
        int maxSum=Integer.MIN_VALUE,minSum=Integer.MAX_VALUE,sarr=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++)
            {
                int ssum=0;
                System.out.print("[");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(" "+arr[k]+" ");
                    ssum=ssum+arr[k];
                }
                System.out.println("]:: Sum="+ssum);
                sarr++;
                if(ssum>maxSum)
                {
                    maxSum=ssum;
                }
                if(ssum<minSum)
                {
                    minSum=ssum;
                }
            }
        }
        System.out.println("Total Subarrays:"+sarr);
        System.out.println("Maximum Subarray Sum is :"+maxSum);
        System.out.println("Minimum Subarray Sum is:"+minSum);
    }
    public static void main(String[] args) {
        int arr[]={45,78,65,31,35};
        subarrSum(arr);
    }
}