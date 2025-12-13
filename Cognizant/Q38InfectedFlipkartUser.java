public class Q38InfectedFlipkartUser {
    public static int getInfectedFlipkartUser(int N)
    {
        if(N==1 || N==2) return 0;
        if(N==3) return 1;
        int a=0,b=0,c=1,d=0;
        for(int i=4;i<=N;i++)
        {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return c;
    }
    public static void main(String[] args) {
       System.out.println(getInfectedFlipkartUser(11)); 
    }
}
