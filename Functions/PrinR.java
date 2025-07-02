import java.util.Scanner;

public class PrinR {
    public static boolean isPrime(int x)
    {
        boolean is=true;
        if(x==1 || x==2)
        {
            return true;
        }
        else{
            for(int i=2;i<=(x/2);i++)
            {
                if(x%i==0)
                {
                    is=false;
                    break;
                }
            }
        }
        return is;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no until you want to print prime numbers:");
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
