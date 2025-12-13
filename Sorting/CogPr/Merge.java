import java.util.Arrays;

public class Merge {
    public static  void mergeSort(int arr[],int start,int end)
    {
        // Base Case
        if(start>=end) 
        {
            return;
        }
        int mid=(start+end)/2; //start+(end-start)/2
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end)
    {
        int temp[]=new int[end-start+1];
        int i=start,j=mid+1,k=0;
        // Merging two sorted arrays 1: start to mid 2: mid+1 to end
        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                k++;i++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        // Remaining Left Part if available
        while(i<=mid)
        {
            temp[k]=arr[i];
            k++;i++;
        }
        // Remaining Right Part if available
        while(j<=end)
        {
            temp[k]=arr[j];
            j++;k++;
        }
        // copying the temp array to main array
        for(k=0,i=start;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
