import java.util.*;
public class Reverse2 {
    public static void main(String[] args) {
        int n,rev=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Any Multiple Digit NO:");
        n=s.nextInt();
        while(n>0)
        {
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        System.out.print("Reverse of Given No is:"+rev);
    }
}
