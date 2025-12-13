public class Arm {
    public static void main(String[] args) {
        int num=153;
        String s=num+"";
        int dig=s.length();
        int sum=0;
        int t=num;
        while(t!=0)
        {
            int ld=t%10;
            sum=sum+(int)Math.pow(ld,dig);
            t/=10;
        }
        if(sum==num)
        {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
