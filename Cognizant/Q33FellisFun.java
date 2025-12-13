public class Q33FellisFun {
    public static long FellisFun(int N)
    {
        long mod=1000000007;
        if(N==0 || N==1) return 1;
        long f[]=new long[N+1];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<=N;i++)
        {
            f[i]=(f[i-1]+7*f[i-2]+(i/4))%mod;
        }
        return f[N];
    }
    public static void main(String[] args) {
            System.out.println(FellisFun(3));
    }
}
