public class Z {
    static void printZ(int n) {
        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == n) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int i = 1; i <= n - j; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }

    static void printN(int n) {
        for (int j = 1; j <= n; j++) {
            for(int i=1;i<=n;i++)
            {
                if(i==1||i==n||i==j)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printN(8);
    }
}
