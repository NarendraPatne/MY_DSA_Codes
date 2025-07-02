import java.util.Scanner;

public class Contin {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter Number:");
            n=sc.nextInt();
            if(n%10==0)
                continue;
            System.out.println("Number is"+n);
        }while(1>0);
    }
}
