import java.util.Stack;

public class Stacck {
    public static void main(String[] args) {
        Stack<String>animals=new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack"+animals);
        System.out.println("Top element:"+animals.peek());
        animals.pop();
        System.out.println("Stack"+animals);
        System.out.println("Top element:"+animals.peek());
    }
}
