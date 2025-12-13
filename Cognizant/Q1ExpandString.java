import java.util.*;

public class Q1ExpandString {
    public static String expandString(String s)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,i+1);
            }
            int count=map.get(ch);
            for(int j=1;j<=count;j++)
            {
                sb.append(ch);
            }
            if(i!=s.length()-1)
            {
                sb.append("-");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(expandString("abcaba"));
    }
}
