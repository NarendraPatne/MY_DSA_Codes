
public class Selection {
    public static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={88,99,77,44,5,33,6,22,1,65,45};
        System.out.println("Before Selection Sort:");
        printArr(arr);
        SelectionSort(arr);
        System.out.println("\nAfter Selection Sort:");
        printArr(arr);
    }
}
