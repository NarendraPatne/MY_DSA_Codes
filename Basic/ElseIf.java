import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        age = s.nextInt();
        if (age >= 13 && age < 18) {
            System.out.print("Teenager!!!");
        } else if (age >= 18) {
            System.out.print("Adult");
        } else {
            System.out.print("Child");
        }
    }
}
