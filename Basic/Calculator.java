import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        double a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A:");
        a=s.nextDouble();
        System.out.print("Enter B:");
        b=s.nextDouble();
        System.out.print("Operation:");
        char c=s.next().charAt(0);
        switch (c) {
            case '+':
                System.out.print(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.print(a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.print(a+"*"+b+"="+(a*b));
                break;
            case '/':
                System.out.print(a+"/"+b+"="+(a/b));
                break;
            case '%':
                System.out.print(a+"%"+b+"="+(a%b));
                break;
            default:
                System.out.println("Wrong Operation!!!");
                break;
        }
    }
}
