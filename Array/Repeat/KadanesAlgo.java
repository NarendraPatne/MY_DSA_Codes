public class KadanesAlgo {
    public static void Kadanes(int arr[]){
        int currSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currSum=currSum+arr[i];
            if(currSum<0)
            {
                currSum=0;
            }
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
        }
        System.out.println("Maximum Subarray Sum Using Kadanes Algorithm is:"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-10,20,-30,40};//{-2,-3,-4,-1};//,-2,1,5,-3};
        Kadanes(arr);
        }
}
