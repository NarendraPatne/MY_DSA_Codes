import java.util.ArrayList;

public class Stackk {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        // Push
        public static void Push(int data){
            list.add(data);
        }
        // Pop
        public static int Pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // Peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        
    }
}
