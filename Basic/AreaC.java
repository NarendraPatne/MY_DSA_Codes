import java.util.Scanner;

public class AreaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle:");
        float r = sc.nextFloat();
        System.out.println("Area of Circle is:" + (3.14 * r * r));
    }
}
