public class BintDec{
    public static int BinarytoDec(int bin)
    {
        int pow=0,rem=0,dec=0;
        while(bin>0)
        {
            rem=bin%10;
            System.out.println(rem);
            bin=bin/10;
            dec=dec+(rem*(int)(Math.pow(2, pow)));
            pow++;
        }
        return dec;
    }
    public static int DectoBin(int dec)
    {
        int bin=0,rem=0,pow=0;
        while(dec>0){
            rem=dec%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            dec=dec/2;
            pow++;
        }
        return bin;
    }
    public static int Dec2Bin(int dec)
    {
        int bin=0,rem=0,pow=0;
        while(dec>0)
        {
            rem=dec%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
            dec=dec/2;
        }
        return bin;
    }
    public static void SubarrSum(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.print("---------------------------\n");
        }
    }
    public static void main(String[] args) {
        // System.out.println(BinarytoDec(1010));
        // System.out.println(Dec2Bin(10));
        int arr[]={10,20,30,40,50};
        SubarrSum(arr);
    }
}