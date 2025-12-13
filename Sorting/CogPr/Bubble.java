import java.util.Arrays;

public class Bubble {
    static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int flag=0;
            for(int j=1;j<arr.length-i;j++)
            {
                System.out.print(".");
                if(arr[j]<arr[j-1])
                {
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                    flag=1;
                }
            }
            if(flag==0) return;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,53,2,1,-5,-2,6,7,8,9};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
