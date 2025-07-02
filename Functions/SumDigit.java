import java.util.*;
public class SumDigit {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        x=sc.nextInt();
        int s=0;
        while(x>0)
        {
            s=s+(x%10);
            x=x/10;
        }
        System.out.println(" Sum of Digits in given NUmber is:"+s);
    }
}
