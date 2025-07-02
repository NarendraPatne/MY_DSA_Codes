import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Any Number:");
        n=s.nextInt();
        while(n>0)
        {
            int ld=n%10;
            System.out.print(ld);
            n=n/10;
        }
    }
}
