public class Selection {
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) 
        {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) 
            {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int x=arr[min];
            arr[min]=arr[i];
            arr[i]=x;
        }
        printArr(arr);
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {89,78,67,56,455,34,23,2};
        SelectionSort(arr);
    }
}
