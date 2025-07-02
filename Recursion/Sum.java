public class Sum {
    public static int Sumn(int n)
    {
        if(n==1)
        {
            return n;
        }
        return n+Sumn(n-1);
    }
    public static void Sumnx(int n,int sum)
    {
        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        Sumnx(n-1,sum+n);
    }
    public static void main(String[] args) {
        System.out.println(Sumn(5));
        Sumnx(5, 0);
    }
}
