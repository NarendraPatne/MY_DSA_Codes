public class Selection {
    public static void SelectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int minInd=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[minInd])
                {
                    minInd=j;
                }
            }
            int t=arr[minInd];
            arr[minInd]=arr[i];
            arr[i]=t;
        }
        printArr(arr);
    }
    public static void BubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int swap=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    System.out.print(j+" ");
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swap=1;
                }
            }
            if(swap==0)
            {
                break;
            }
        }
        printArr(arr);
    }
    public static void InsertionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
        }
        printArr(arr);
    }
    public static void printArr(int arr[])
    {
        System.out.println();
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={34,23,52,1,4,67,8,4,3};
        // SelectionSort(arr);
        // BubbleSort(arr);
        InsertionSort(arr);
    }   
}