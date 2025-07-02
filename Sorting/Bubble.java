public class Bubble {
    public static void BubbleSort(int arr[])
    {
        boolean swap=false;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int x=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                    // System.out.print("i  ");
                }
                else{
                    swap=true;
                }
            }
            if(swap==false)
            break;
        }
        System.out.println("Sorted Array is::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={23,13,45,44,24,75,12,33,56};
        BubbleSort(arr);   
    }
}
