public class Q2CountFairSplit {
    public static int countSplits(int[]arr)
    {
        int totalSum=0,count=0;
        for(Integer i:arr)
        {
            totalSum+=i;
        }
        int currSum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            currSum+=arr[i];
            int remSum=totalSum-currSum;
            int diff=Math.abs(currSum-remSum);
            if(diff%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {10, 10,12,12};
        // System.out.println(countSplits(A));
        System.out.println(Math.abs(45-90));
    }
}
