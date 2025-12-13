public class Q35PairMaxProduct {
    public static int[] getPairWithMaxProduct(int N,int []A)
    {
        int []pair=new int[2];
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                // A[i]>A[j] && 
                if(A[i]+A[j]==18)
                {
                    int product=A[i]*A[j];
                    if(product>maxProduct)
                    {
                        maxProduct=product;
                        pair[0]=Math.max(A[i], A[j]);
                        pair[1]=Math.min(A[i],A[j]);
                    }
                }
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        int arr[]={11,1,2,8,10,11,15,7};
        int res[]=getPairWithMaxProduct(8, arr);
        int arr2[]={20,16,2,1,5};
        int res1[]=getPairWithMaxProduct(5, arr2);
        System.out.println(res[0]+" "+res[1]);
        System.out.println(res1[0]+" "+res1[1]);
    }
}
