import java.util.*;

public class BinCoe {
    public static int Fact(int x)
    {
        int f=1;
        for(int i=1;i<=x;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int BinCoe(int n,int r)
    {
        int nf=Fact(n);
        int rf=Fact(r);
        int nmrf=Fact(n-r);
        return (nf/(rf*nmrf));
    }
    public static void main(String[] args) {
        int n,r;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter N:");
        n=sc.nextInt();
        System.out.print("Enter R:");
        r=sc.nextInt();
        System.out.println("Binomial COefficient is:"+BinCoe(n, r));
    }
}
