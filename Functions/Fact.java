import java.util.*;
public class Fact {
    public static int Ffun(int f)
    {
        int fact=1;
        for(int i=1;i<=f;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No:");
        f=sc.nextInt();
        int c=Ffun(f);
        System.out.println("Factorial of "+f+" is:"+c);
    }
}
