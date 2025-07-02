public class ReverseArr {
    public static void RevArr(int arr[])
    {
        int beg=0,end=arr.length-1,temp;
        while(beg<end)
        {
            temp=arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr1[]={45,13,94,84,95,54,66,58,88,31};
        System.out.println("Before Reverse:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("After Reverse:");
        RevArr(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        // Note that you passed the array arr1 to RevArr function and used parameter as arr only but even 
        // the reverse is done in main copy of array
    }
}
