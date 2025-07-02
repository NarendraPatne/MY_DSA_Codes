public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int z=0;
        for(int i=0;i<arr.length;i++)
         z=z+arr[i];
        int preSum[] = new int[arr.length];
        int max=Integer.MIN_VALUE;
        preSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print(" "+(i==0?preSum[j]:preSum[j]-preSum[i-1])+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int cSum = i==0?preSum[j]:preSum[j] - preSum[i-1];
                if(cSum>max)
                max=cSum;
            }
        }
        System.out.println("Maximum Sum of SUbarray is:"+max+" z="+z);
    }
}
