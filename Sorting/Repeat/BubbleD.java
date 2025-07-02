public class BubbleD {
    public static void BubbleSortD(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    // Swap(arr, j+1, j);
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    flag=false;
                }
            }
            if(flag==true)
            {
                break;
            }
        }
        printArr(arr);
    }
    // public static void Swap(int arr[],int a,int b)
    // {
    //     arr[a]=arr[a]+arr[b];
    //     arr[b]=arr[a]-arr[b];
    //     arr[a]=arr[a]-arr[b];
    // }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        BubbleSortD(arr);
    }
}
