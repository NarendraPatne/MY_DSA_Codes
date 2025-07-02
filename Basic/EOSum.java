import java.util.Scanner;

public class EOSum {
    public static void main(String[] args) {
        int even=0,odd=0;
        int []a=new int[10];
        int n=10;
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the No of Elements you want to Enter:");
        // n=sc.nextInt();        
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even=even+a[i];
            }
            else{
                odd=odd+a[i];
            }
        }   
        System.out.println(" Addition of Even NUmbers:"+even+" \n Addition of Odd NUmbers:"+odd);
    }
}
