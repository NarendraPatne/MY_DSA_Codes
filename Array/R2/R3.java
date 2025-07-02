public class R3 {
    public static int Factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int BinCoeff(int n,int r){
        return Factorial(n)/(Factorial(r)*Factorial(n-r));
    }
    public static boolean Prime(int n){
        int flag=1;
        if(n==2){
            return true;
        }
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int x){
       for(int j=1;j<=x;j++)
       {
            if(Prime(j)==true){
                System.out.print(j+" ");
            }
         }
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println(BinCoeff(5, 2));
       printPrime(40);
    }
}
