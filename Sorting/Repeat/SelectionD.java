public class SelectionD {
    public static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int max=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[max])
                {
                    max=j;
                }
            }
            int t=arr[max];
            arr[max]=arr[i];
            arr[i]=t;
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
    SelectionSort(arr);
    return;
 }   
}
