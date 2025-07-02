import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Any number:");
        // x=sc.nextInt();
        // for(int i=1;i<x;i++)
        // {
        //     System.out.println(i);
        //     if(i==11)
        //         break;
        // }
        do{
            System.out.print("Enter No:");
            x=sc.nextInt();
            if(x%10==0)
                break;
            System.out.println(x);
        }while(true);
    }
}
