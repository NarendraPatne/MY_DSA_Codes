public class Sam {
    public static void Comp(int n)
    {
        int x=n;
        int mask=0;
        while(x!=0)
        {
            mask=mask<<1;
            x=x>>1;
            mask=mask|1;
        }
        int comp=~n&mask;
        System.out.println(comp);
    }
    public static void main(String[] args) {
        // System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(0));
    //     System.out.println((~5)&-1);
    //     System.out.println(-1<<1);
    Comp(0);
    }
}
