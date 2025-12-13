import java.util.Arrays;

public class Quick2 {
    public static void quickSort(int arr[],int start,int end)
    {
        if(start>=end) return;
        int pivotIdx=partition(arr,start,end);
        quickSort(arr, start, pivotIdx-1);
        quickSort(arr, pivotIdx+1, end);
    }
    public static int partition(int arr[],int start,int end)
    {
        int i=start-1,pivot=arr[end];
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
        int t=arr[end];
        arr[end]=arr[i];
        arr[i]=t;
        return i;
    }
    public static void main(String[] args) {
       int arr[]={6,4,2,2,2,2,3,3,4,4,54,66,7,7,77,4,3};
       System.out.println(Arrays.toString(arr));
       quickSort(arr, 0, arr.length-1); 
       System.out.println(Arrays.toString(arr)); 
    }  
}
