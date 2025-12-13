import java.util.Arrays;

public class Q12GreatAdjCnt {
    public static int [] getGreatAdjCount(int N,int arr[])
    {
        int result[]=new int[N];
        for(int i=0;i<N;i++)
        {
            if(i==0)
            {
                if(arr[i]<arr[i+1])
                {
                    result[i]++;
                }
                if(arr[i]<arr[N-1])
                {
                    result[i]++;
                }
            }else if(i==N-1)
            {
                if(arr[0]>arr[i])
                {
                    result[i]++;
                }
                if(arr[i-1]>arr[i])
                {
                    result[i]++;
                }
            }else{
                if(arr[i]<arr[i-1])
                {
                    result[i]++;
                }
                if(arr[i]<arr[i+1])
                {
                    result[i]++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={3, 5, 2, 8, 1};
        int[] arr1 = {10,15,12,9,14};
        int []res1=getGreatAdjCount(5, arr);
        int []res2=getGreatAdjCount(5, arr1);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }
}
