import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any  Number:");
        x=s.nextInt();
        if(x%2==0)
        {
            System.out.println(x+" is an Even Number");
        }
        else
        {
            System.out.println(x+" is an Odd Number!");
        }
    }
    
}
