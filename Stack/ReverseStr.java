import java.util.Stack;

public class ReverseStr {
    public static String reverseStr(String s)
    {
        Stack<Character>st=new Stack<>();
        int idx=0;
        while(idx!=s.length())
        {
            st.push(s.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("Don"));
    }
}
