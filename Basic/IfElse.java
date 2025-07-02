import java.util.*;
public class IfElse 
{
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You can Vote and Drive!!");
        }
        else
        {
            System.out.println("You are not eligibie for Voting & driving!!");
        }
    }   
}
