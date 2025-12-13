import java.util.Arrays;

public class Quick {
    public static void quickSort(int arr[],int start,int end)
    {
        if(start>=end) return;
        int pivotIdx=partition(arr, start, end);
        quickSort(arr, start, pivotIdx-1);
        quickSort(arr, pivotIdx+1,end);
    }
    public static int partition(int arr[],int start,int end)
    {
        // Finding elements less than pivot
        // Pivot element is the element present at idx: end
        int i=start-1;
        int pivot=arr[end];
        for(int j=start;j<end;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        i++;
        int t=arr[i];
        arr[i]=arr[end]; //arr[end] : pivot element
        arr[end]=t;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,4,5,6,64,3,2,1,1,43,4,54,5,5,6,7,7,89};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
