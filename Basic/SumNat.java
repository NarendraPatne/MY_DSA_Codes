import java.util.Scanner;

public class SumNat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i=1;
        System.out.print("Enter no until you want print sum of Natural Num:");
        n=s.nextInt();
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of "+n+" Natural Numbers:"+sum);
    }
}
