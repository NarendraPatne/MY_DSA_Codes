import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParen(String s)
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            // Opening
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                // Closing
                if(stack.isEmpty()) return false;
                if(stack.peek()=='(' && ch==')' || stack.peek()=='{' && ch=='}' || stack.peek()=='[' && ch==']')
                {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pstr="{([])}";
        System.out.println(isValidParen(pstr));
    }
}
