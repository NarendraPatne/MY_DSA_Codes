public class PrefixSum {
    public static void maxSubsum(int arr[])
    {
        int prefixSum[]=new int[arr.length];
        prefixSum[0]=arr[0];
        int maxSum=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int currSum=(i==0)?prefixSum[j]:prefixSum[j]-prefixSum[i-1];
                if(currSum>maxSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum Subarray  Sum is:"+maxSum);
      }
    public static void main(String[] args) {
        int arr[]={45,-2,33,95,62,63};
        maxSubsum(arr);
    }
}
