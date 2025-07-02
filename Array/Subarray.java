public class Subarray {
    public static void Subarr(int ar[])
    {
        int x=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i;j<ar.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(ar[k]+" ");
                }
                x++;
                System.out.println();
            }
            System.out.println("---------------------------------");
        }
        System.out.println("Total Subarrays:"+x);
    }
    public static void main(String[] args) {
        int ar[]={12,23,43,55,45,65,75};
       Subarr(ar);
}
}