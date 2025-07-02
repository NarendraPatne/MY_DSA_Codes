import java.util.*;
public class Large2 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter X:");
        x=sc.nextInt();
        System.out.print("Enter Y:");
        y=sc.nextInt();
        if(x>y)
        {
            System.out.println(x+" is Greater than "+y);
        }
        else
        {
            System.out.println(y+" is Greater than "+x);
        }
    }
    
}
