public class SubArrSum {
    public static void Subarr(int ar[])
    {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i;j<ar.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum=sum+ar[k];
                     System.out.print(ar[k]+" ");
                }
                System.out.print("::"+sum+"\n");
                if(sum>max)
                  max=sum;
                sum=0;
            }
            System.out.println("---------------------------------");
        }
        System.out.println("********************Max Sum:"+max);
    }
    public static void main(String[] args) {
        int ar[]={-10,20,-30,40,-50,60,-70,80};//{12,23,43,55,45,65,75};
       Subarr(ar);
}
}