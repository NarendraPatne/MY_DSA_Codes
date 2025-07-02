import java.util.*;
public class Bin2Dec {
    public static int B2D(int bin)
    {
        int dec=0;
        int pow=0;
        while(bin>0)
        {
            int ld=bin%10;
            dec=dec+(ld*(int)Math.pow(2, pow));
            pow++;
            bin=bin/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        int bin;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary NUmber:");
        bin=sc.nextInt();
        System.out.println(" Decimal of "+bin+" is:"+B2D(bin));
    }
}
