public class Prime {
    public static boolean ifPrime(int num)
    {
        if(num==1) return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
            for(int i=1;i<=50;i++)
            {
                if(ifPrime(i))
                {
                    System.out.print(i+" ");
                }
            }
    }
}
