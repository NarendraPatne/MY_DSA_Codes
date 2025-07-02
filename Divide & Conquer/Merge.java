public class Merge{
    public static void MergeSort(int arr[],int start,int end)
    {   
        // Base Case
        if(start>=end)
        {
            return;
        }
        // Get Mid
        int mid=(start+end)/2;
        // Left part
        MergeSort(arr, start, mid);
        // Right part
        MergeSort(arr, mid+1, end);
        // Conquering: Merging the sorted elements
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end)
    {
        int temp[]=new int[end-start+1];
        // Iterator for left part
        int i=start;
        int j=mid+1; //Iterator for right part
        int k=0; //Iterator for temp arr
        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                k++;
                i++;
            }else
            {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        // Remaining left part
        while(i<=mid){
            temp[k]=arr[i];
            k++;i++;
        }
        // Remaining right part
        while(j<=end)
        {
            temp[k]=arr[j];
            k++;j++;
        }
        // Copy temp to original array
        for(k=0,i=start;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
    public static void printArr(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,5,4,3,2,2,4,6,7,5,-3};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}