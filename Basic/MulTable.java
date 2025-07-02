import java.util.*;
public class MulTable {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the NUmber for Printing Table:");
        x=sc.nextInt();
        System.out.println("Table of "+x+" is:");
        for(int i=1;i<11;i++)
        {
            System.out.println(x+" * "+i+" ="+(x*i));
        }
    }
}
