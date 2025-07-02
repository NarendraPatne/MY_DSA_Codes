import java.util.Scanner;

public class PalindromeStr {
    public static void checkPalin(String str)
    {
        int start=0,end=str.length()-1;
        int flag=1;
        // for(int i=0;i<str.length()/2;i++)
        // {
        //     int n=str.length()-1;
        //     if(str.charAt(i)!=str.charAt(n-i))
        //     {
        //         flag=0;
        //         System.out.println(str+" is not Palindrome");
        //          break;
        //     }
        // }
        // if(flag==1)
        // {
        //     System.out.println(str+" is Palindrome");
        // }
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                flag=0;
                System.out.println(str+" is not Palindrome");
                break;
            }
            start++;
            end--;
        }
        if (flag==1) {
            System.out.println(str+" is Palindrome");
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String for checking Palindrome:");
        str=sc.next();
        checkPalin(str);
    }
}
