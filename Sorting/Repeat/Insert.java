import java.util.Arrays;

public class Insert {
    public static void sortI(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[10];//{78,32,2,51,34,92,4,5};
        print(arr);
        System.out.println("\nAfter Sorting:");
        // sortI(arr);
        Arrays.sort(arr,3,7);
        print(arr);
    }
}
