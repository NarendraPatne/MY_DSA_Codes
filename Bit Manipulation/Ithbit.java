import java.util.Scanner;

public class Ithbit {
    public static void getIthbit(int no,int i)
    {
        int bitMask=1<<i;
        if((no&bitMask)==0)
        {
            System.out.println(i+"th bit is 0");
        }else{
            System.out.println(i+"th bit is 1");
        }
    }
    public static void setIthbit(int no,int i)
    {
        int bitMask=1<<i;
        int setBitno=(no|bitMask);
        System.out.println(no+" after setting "+i+"th bit is:"+setBitno);
    }
    public static void clearIthbit(int no,int i)
    {
        int bitMask=~(1<<i);
        int cleardBno=(no&bitMask);
        System.out.println(no+" after clearing "+i+"th bit becomes: "+cleardBno);
    }
    public static void updateIthBit(int no, int i, int opr)
    {
        int updNo;
        int bitMask;
        if(opr==1)
        {
            bitMask=(1<<i);
            updNo=(no|bitMask);
            System.out.println(no+" after setting "+i+"th bit becomes:"+updNo);
        }else{
            bitMask=~(1<<i);
            updNo=(no&bitMask);
            System.out.println(no+" after clearing "+i+"th bit becomes:"+updNo);
        }
    }
    public static void clrRangeBits(int no,int j,int i)
    {
        int aMask=(~0)<<j+1;
        int bMask=~((~0)<<i);
        // System.out.println("aMask:"+Integer.toBinaryString(aMask));
        // System.out.println("bMask:"+Integer.toBinaryString(bMask));
        int bitMask=aMask|bMask;
        // System.out.println("bitMask:"+Integer.toBinaryString(bitMask));
        int clrRNo=(no&bitMask);
        System.out.println(no+" after clearing range of bits from "+i+" to "+j+" is: "+clrRNo);
        // System.out.println("Binary form of ans:"+Integer.toBinaryString(clrRNo));
    }
    public static void powoftwo(int no)
    {
        if((no&(no-1))==0)
        {
            System.out.println(no+" is in Power of two");
        }else{
            System.out.println(no+" is not in Power of two");
        }
    }
    public static void countSetbit(int n)
    {
        int count=0;
        int no=n;
        while(no>0)
        {
            if((no&1)==1)
            {
                count++;
            }
            no=no>>1;
        }
        System.out.println(n+" in binary is:"+Integer.toBinaryString(n));
        System.out.println("Set bits in "+n+" is:"+count);
    }
    public static void fastExp(int a,int pow)
    {
        int ans=1;
        while(pow>0)
        {
            if((pow&1)==1)
            {
                ans=ans*a;
            }
            a=a*a;
            pow=pow>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // You have to pass decimal number with i th position for the bit
        // getIthbit(10, 3);
        // setIthbit(10, 0);
        // clearIthbit(10, 1);
        // System.out.println("------------------------------");
        // System.out.println("Update Bit:");
        // Scanner s=new Scanner(System.in);
        // System.out.print("Enter No:");
        // int no=s.nextInt();
        // System.out.print("Enter Bit Pos:");
        // int i=s.nextInt();
        // System.out.print("Enter 1 to Set "+i+"th bit or 0 to clear:");
        // int opr=s.nextInt();
        // updateIthBit(no, i, opr);
        // System.out.println(Integer.parseInt("10001011010",2));
        // System.out.println(Integer.toBinaryString(1114));
    //     clrRangeBits(1114, 6 , 2);
    //     clrRangeBits(10, 4 , 2);
    // powoftwo(2);
    // countSetbit(11);
        fastExp(3, 5);
    }
}
