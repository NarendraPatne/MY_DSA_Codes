public class Rhombus {
    public static void Rhp(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
 public static void main(String[] args) {
   Rhp(8);
 }
}
