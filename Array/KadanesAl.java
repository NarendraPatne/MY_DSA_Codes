public class KadanesAl {
    public static int KadAl(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++)
        {
            cs=cs+arr[i];
            if(cs<0)
             cs=0;
             max=Math.max(cs,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-10,20,-30,40,-50,60,70,80};
        System.out.println("Maximum Sum of Subarray is :"+KadAl(arr));
    }
}
