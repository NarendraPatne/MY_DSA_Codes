public class ArmF {
    public static void ifArmstrong(int num){
        int sum=0,temp=num;
        String s=num+"";
        int dig=s.length();
        while(temp!=0)
        {
            int ld=temp%10;
            sum+=Math.pow(ld,dig);
            temp/=10;
        }
        if(sum==num)
        {
            System.out.println(num+" is Armstrong Number");
        }else{
            System.out.println(num+" is Not Armstrong Number");
        }
    }
    public static void main(String[] args) {
        ifArmstrong(153);
        ifArmstrong(154);
    }
}
