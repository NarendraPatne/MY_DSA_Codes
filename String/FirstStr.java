import java.util.Scanner;

public class FirstStr {
    public static void printLetters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // String is collection of characters. In java String is a class and we create the object of that class that can store sequence of characters.
        char arr[]={'a','b','c','d'};
        // String declaration
        String str="avsnndf";
        String str1=new String("soidfois");
        // Taking input of strings
        Scanner sc=new Scanner(System.in);
        // sc.next() This method takes only one word input if you put space between two words it will read only first word and return to variable
        String name=sc.next();
        System.out.println(name.length());
        printLetters(name);
        // sc.nextLine() This method returns whole entered sentence or line to the variable
        // String line=sc.nextLine();
    }    
}
