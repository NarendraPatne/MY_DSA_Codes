import java.util.Scanner;

public class Primerep {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int flag=0;
        System.out.print("Enter Number:");
        int num=s.nextInt();
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag++;
            }
        }
        if(flag==0)
            System.out.println(num+" is Prime Number");
        else
            System.out.println(num+" is not Prime");
    }
}
