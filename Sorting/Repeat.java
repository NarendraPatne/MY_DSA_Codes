public class Repeat{
    // Bubble Sort : Compare Adjacent Elements and swap them if found in wrong order
    public static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int swap=0;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swap=1;
                }
                System.out.println(j);
            }
            if(swap==0)
            {
                break;
            }
        }
    }
    // Selection Sort : Divide array in Sorted and Unsorted part. Select smallest elements index from unsorted part and put it in the sorted part by swapping.
    public static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minInd=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minInd])
                {
                    minInd=j;
                }
            }
            // Swap
            int t=arr[minInd];
            arr[minInd]=arr[i];
            arr[i]=t;
        }
    }
    // Insertion Sort: Divide array in Sorted part and Unsorted part select element from unsorted part and insert it into sorted part at right position by shifting other elements.
    public static void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length-1;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void printArr(int arr[])
    {
        for(int a:arr)
        {
            System.out.print(" "+a);
        }
    }
    public static void main(String[] args) {
        int arr[]={7,6,5,1,2,3,4};
        SelectionSort(arr);
        printArr(arr);
    }
}