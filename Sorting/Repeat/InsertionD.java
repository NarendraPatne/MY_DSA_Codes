public class InsertionD {
    public static void InsertionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        print(arr);
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String[] args) {
    int arr[]={3,6,2,1,8,7,4,5,3,1};
    InsertionSort(arr);
}    
}
