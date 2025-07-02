import java.util.*;
public class Rev {
    public static void main(String[] args) {
        int x,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No:");
        x=sc.nextInt();
        while(x>0)
        {
            rev=rev*10;
            rev=rev+(x%10);
            x=x/10;
        }
        System.out.println(" Reverse of "+x+" is:"+rev);
    }
}
