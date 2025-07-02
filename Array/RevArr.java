public class RevArr {
    public static void RevArr(int arr[])
    {
        int l,r;
        l=0;r=arr.length-1;
        while(l<r)
        {
            arr[l]=arr[l]+arr[r];
            arr[r]=arr[l]-arr[r];
            arr[l]=arr[l]-arr[r];
            l++; r--;
        }
        
    }
public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    RevArr(arr);
    System.out.println("Reversed array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
}    
}
