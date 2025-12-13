import java.util.*;
public class Stack2 {
    static class Stack{
        static ArrayList<Integer>list=new ArrayList<>();
        // isempty
        public static boolean isEmpty(){
            return list.size()==0;
        }
        // push
        public static void push(int data)
        {
            list.add(data);
        }
        // pop 
        public static int pop()
        {
            if(isEmpty()) return -1;
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            // list.removeLast();
            return top;
        }
        // peek
        public static int peek()
        {
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
            // return list.getLast();
        }
        // print
        public static void print()
        {
            if(isEmpty()) return;
            for(Integer i:list)
            {
                System.out.print(i+" ");
            }
            System.out.println("<- Top");
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.print();
        System.out.println(s.peek());
        s.pop();
        s.print();
        s.peek();

    }
}
