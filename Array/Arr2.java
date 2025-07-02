public class Arr2 {
    public static void update(int arr[],int nonChangable)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]++;
            nonChangable++;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int nonChangable=12;
        update(arr, nonChangable);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(nonChangable);
    }
}
