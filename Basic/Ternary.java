import java.util.*;
public class Ternary{
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter x:");
        x=s.nextInt();
        System.out.println((x%2==0)?"Even":"Odd");
    }
}