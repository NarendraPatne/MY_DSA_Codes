import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // Sorting the char arrays and comparing them to get anagram status
        String s1="tenet";
        String s2="tenegt";
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b))
        {
            System.out.println("Anagram Strings");
        }else{
            System.out.println("Not Anagram Strings");
        }
    }
}
