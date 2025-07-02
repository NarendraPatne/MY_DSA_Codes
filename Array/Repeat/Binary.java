public class Binary {
    public static int BinSearch(int arr[],int key)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,94};
        int key=95;
        int index=BinSearch(arr, key);
        if(index==-1)
        {
            System.out.println(key+" is not present in Array");
        }
        else{
            System.out.println(key+" is present at Index "+index);
        }
        return;
    }
}
