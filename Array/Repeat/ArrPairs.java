public class ArrPairs {
    public static void printPairs(int arr[])
    {
        int pairs=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs is:"+pairs);
    }
    public static void main(String[] args) {
        int arr[]={45,14,32,95,74,61,92,74,45};
        System.out.println("All possible pairs:");
        printPairs(arr);
    }
}
