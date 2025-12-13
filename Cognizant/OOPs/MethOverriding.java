public class MethOverriding {
    public static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int nthfact(int n)
    {
        if(n<=1) return n;
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        String s="tenet";
        StringBuilder sb=new StringBuilder(s);
        String r=sb.reverse().toString();
        System.out.println(s);
        System.out.println(r);
        if(s.equals(r))
        {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        System.out.println(fact(5));
        System.out.println(nthfact(9));
    }    
}
