public class Pr{
    public static void reverseArray(int arr[]) {
        // code here
        int start=0;
        int end=arr.length-1;
        int t=0;
        while(start<end)
        {
           t=arr[start];
           arr[start]=arr[end];
           arr[end]=t;
           start++;
           end--;
        }
        for(int e:arr)
        {
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        reverseArray(arr);
    }
}