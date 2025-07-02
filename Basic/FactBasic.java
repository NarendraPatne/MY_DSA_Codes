import java.util.*;
public class FactBasic {
    public static void main(String[] args) {
        int f=1,x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        x=sc.nextInt();
        for(int i=x;i>0;i--)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+x+" is:"+f);
    }
}
