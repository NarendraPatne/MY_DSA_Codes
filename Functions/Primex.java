import java.util.Scanner;

public class Primex {
    public static boolean isPrime(int x)
    {
        boolean is=true;
        if(x==2)
        {
            return true;
        }
        else if(x==1)
        {
            return false;
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
        System.out.print("Enter no to check if prime or not:");
        n=sc.nextInt();
        
        if(isPrime(n)==true)
        {
            System.out.println(n+" is Prime");
        }
        else
        {
            System.out.println(n+" is not Prime");
        }
    }
}
