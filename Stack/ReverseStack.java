import java.util.Stack;

public class ReverseStack {
    public static void pushBottom(Stack <Integer>s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }
        int top=stack.pop();
        reverseStack(stack);
        pushBottom(stack,top);
    }
    public static void printStack(Stack <Integer>s)
    {
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        printStack(s);
    }
}
