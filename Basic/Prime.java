import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int x,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No:");
        x=sc.nextInt();
        for(int i=2;i<Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                flag++;
            }
        }
        if(flag==0)
        {
            System.out.print(x+" is Prime Number");
        }
        else
        {
            System.out.print(x+" is Not Prime Number");
        }
    }
}
