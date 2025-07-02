public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 15, 48, 4, 3, 55, 6, 9, 87 };
        System.out.println(arr.length);
        InsertionS(arr);
    }
    public static void InsertionS(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[curr]) 
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[curr];
        }
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
