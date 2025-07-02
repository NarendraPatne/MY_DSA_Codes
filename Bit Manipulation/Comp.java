public class Comp {
    public static int compp(int n)
    {
        if(n==0)return 1;
        int x=n;
        int mask=0;
        while(x!=0)
        {
            mask=mask<<1;
            mask=mask|1;
            x=x>>1;
        }
        return (~n)&mask;
    }
    public static void main(String[] args) {
        int mask=(-1)<<3;
        System.out.println(Integer.toBinaryString(~mask));
        System.out.println(~5&(~mask));
        System.out.println(compp(5));
    }
}
