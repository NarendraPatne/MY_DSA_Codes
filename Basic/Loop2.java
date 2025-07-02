import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any Number:");
        n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
