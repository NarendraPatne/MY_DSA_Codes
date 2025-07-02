public class Factx{
    public static int factNum(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fact=n*factNum(n-1);
        System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
        factNum(5);
    }
}