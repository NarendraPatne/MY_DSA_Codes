import java.util.*;
public class Large3 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st Num:");
        x=s.nextInt();
        System.out.print("Enter 2nd Num:");
        y=s.nextInt();
        System.out.print("Enter 3rd Num:");
        z=s.nextInt();
        if(x>y)
        {
            if(x>z)
            {
                System.out.println(x+" is Largest");
            }
            else if(z>x)
            {
                System.out.println(z+" is Largest");
            }
        }
        else
        {
            if (y>z) {
                System.out.println(y+" is Largest");
            }
            else if(z>y)
            {
                System.out.println(z+" is Largest");
            }
        }
    }
}
