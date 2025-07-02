public class FunRepAll {
    public static void printHW() {
        System.out.println("Hello! World.");
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }

    public static float Multiply(float a, float b) {
        return a * b;
    }

    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int BinomialCo(int n, int r) {
        return (Factorial(n)) / (Factorial(r) * (Factorial((n - r))));

    }

    // ---------------------------------------------------------------------
    public static void PrimeorN(int n) {
        boolean flag = true;
        if (n == 1) {
            System.out.println(n + " Not Prime");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                System.out.println(n + " Not Prime");
                break;
            }
        }
        if (flag == true) {
            System.out.println(n + " Prime Number");
        }
    }

    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void BintoDec(int n) {
        int rem = 0, dec = 0, pow = 0, x = n;
        while (x > 0) {
            rem = x % 10;
            x = x / 10;
            dec = dec + (rem * (int) Math.pow(2, pow));
            pow++;
        }
        System.out.println(dec);
    }

    public static void DectoBin(int n) {
        int bin =0 , x = n, rem = 0,pow=0;
        while (x > 0) {
            rem = x % 2;
            x = x / 2;
            bin = bin+(rem*(int)Math.pow(10, pow));
            pow++;
        }
        System.out.println(bin);
    }
    public static void DecBin(int n)
    {
        int rem=0,bin=0,x=n,pow=0;
        while(x>0)
        {
            rem=x%2;x=x/2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        // printHW();
        // System.out.println("Sum:" + Sum(5, 9));
        // System.out.println("Product:" + Multiply(5, 9));
        // System.out.println("Factorial:" + Factorial(5));
        // System.out.println("Binomial Coeff:" + BinomialCo(5,2));
        // for(int i=1;i<=10;i++)
        // {
        // PrimeorN(i);
        // }
        DecBin(5);
    }
}
