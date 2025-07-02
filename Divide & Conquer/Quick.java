public class Quick {
    public static void quickSort(int arr[],int low,int high)
    {
        if(low>high)
        {
            return;
        }
        // Takes the pivot element puts it at its right place and returns its index
        int partInd=partition3(arr,low,high);
        // Left Part
        quickSort(arr, low, partInd-1);
        // Right Part
        quickSort(arr, partInd+1, high);
    }
    // Lomuto partition makes more swaps less and simple code
    public static int partition2(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        i++;
        int t=pivot;
        arr[high]=arr[i];
        arr[i]=t;
        return i;
    }
    // Hoare partition method makes less swaps ane more efficient
    public static int partition(int arr[],int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<high)
            {
                i++;
            }
            while(arr[j]>pivot && j>low)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void printArr(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static int partition3(int arr[], int low, int high) {
        // your code here
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<high)
            {
                i++;
            }
            while(arr[j]>pivot && j>low)
            {
                j--;
            }
            if(i<j)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        // int arr[]={5,2,6,3,2,7,9,5,8,8};
        int arr[]={17,24,28,7,15};
        quickSort(arr, 0, arr.length-1);   
        printArr(arr);
    }
}
