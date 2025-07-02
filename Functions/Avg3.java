import java.util.Scanner;

public class Avg3 {
    public static int Avg(int a,int b,int c)
    {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Average:"+Avg(a, b, c));
    }
}
