import java.util.Arrays;

public class Selection {
    static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            // Find smallest element and put it at beginning
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            int t=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=t;
        }
    }
    static void SelectionSort2(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int currMin=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[currMin]>arr[j])
                {
                    currMin=j;
                }
            }
            int t=arr[currMin];
            arr[currMin]=arr[i];
            arr[i]=t;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,21,3,5,6,7,76,9};
        // SelectionSort(arr);
        SelectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
