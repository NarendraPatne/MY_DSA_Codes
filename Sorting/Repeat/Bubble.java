
public class Bubble {
    public static void main(String[] args) {
        // int arr[]={99,88,77,66,55,44,11,22,33};
        int arr[]={1,2,3,4,6,5};
        BubbleSort(arr);
        System.out.println("Printing Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int flag=1;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    flag=0;
                }
            }
            if(flag==1)
            {
                System.out.println("Optimized!!");
                break;
            }
        }
    }
}
