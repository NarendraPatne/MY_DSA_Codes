import java.util.*;

public class Dec2Bin {
//     public static int D2B(int dec) {
//         int bin = 0, pow = 0;
//         while (dec > 0) {
//             int rem = dec % 2;
//             bin = bin + (rem * (int) Math.pow(10, pow));
//             pow++;
//             dec = dec / 2;
//         }
//         return bin;
//     }

    public static int D2B(int dec){
        int bin=0,pow=0;
        while(dec>0)
        {
            int rem=dec%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
            dec/=2;
        }
        return bin;
    }
    public static void main(String[] args) {
        int dec;
        System.out.println("Enter Decimal Value:");
        Scanner sc = new Scanner(System.in);
        dec = sc.nextInt();
        System.out.print(" Binary of "+dec+" is:"+D2B(dec));
    }
}
