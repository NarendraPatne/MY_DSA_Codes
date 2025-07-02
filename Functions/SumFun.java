import java.util.*;
public class SumFun {
    public static void Sum(int a,int b)
    {
        System.out.println("Sum of "+a+" + " +b+" is:"+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter A:");
        x=sc.nextInt();
        System.out.print("Enter B:");
        y=sc.nextInt();
        Sum(x, y);
    }
}
