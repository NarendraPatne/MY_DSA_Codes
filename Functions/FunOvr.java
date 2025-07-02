public class FunOvr {
    public static int Sum(int a,int b)
    {
        return a+b;
    }
    public static int Sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(" Additio of 56 and 34:"+Sum(56, 34));
        System.out.println("Addition of 23, 45 and 56 is:"+Sum(23, 45, 56));
    }
}
