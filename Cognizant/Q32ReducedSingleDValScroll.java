public class Q32ReducedSingleDValScroll{
    public static int getReducedSingleDVal(int N)
    {
        while(N>=10)
        {
            int sum=0;
            while(N>0)
            {
                sum+=N%10;
                N/=10;
            }
            N=sum;
        }
        return N;
    }
    public static void main(String[] args) {
        int N=38;
        System.out.println(getReducedSingleDVal(N));
        // hack
        System.out.println((N == 0) ? 0 : 1 + (N - 1) % 9);
    }
}