public class Newsam {
    public static void BasicStar(int n) {
        // 1] Basic Star Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void InvertedStar(int n) {
        // 2] Inverted Star Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void HalfPyramid(int n) {
        // 3] Half Pyramid No
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void CharacterPattern(int n) {
        // 4] Character Pattern
        char c = 'A';
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    public static void HollowRect(int n) {
        // 5] Hollow Rectangle Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void InvRoHP(int n) {
        // 6] Inverted and Rotated Half Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void InvHPNo(int n) {
        // 7] Inverted Half Pyramid with Numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Floyd(int n) {
        // 8] Floyd Triangle
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }

    public static void Tri01(int n) {
        // 9] 0-1 Triangle Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n) {
        // 10] Butterfly Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void SolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void HollowRhom(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void Diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Diamond(n);
    }
}