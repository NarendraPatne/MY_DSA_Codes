public class Q49PrimeRange {
    public static boolean isPrime(int n)
    {
        if(n<2) return false;
        if(n==2) return true;   
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void printPrimeRange(int l,int u)
    {
        for(int i=l;i<=u;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        printPrimeRange(2, 50);
    }
}
