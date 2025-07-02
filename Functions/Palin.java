import java.util.Scanner;

public class Palin 
{
    public static void main(String[] args) {
        int x,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No:");
        x=sc.nextInt();
        int y=x;
        while(x>0)
        {
            rev=rev*10;
            rev=rev+(x%10);
            x=x/10;
        }
        if(rev==y)
        {
            System.out.print(rev+" is a Palindrome Number!!");
        }
    }    
}
