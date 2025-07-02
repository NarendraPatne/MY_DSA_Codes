public class Insertion{
    public static void sortInsertion(int arr[])
    {
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
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
        int arr[]={78,32,2,51,34,92,4,5};

    }
}