public class StriverrPr {
    public static void printName(String name,int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.println(name);
        printName(name, n-1);
    }
    public static void print1tn(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        print1tn(n-1);
        System.out.print(n+" ");
    }
    public static void printnt1(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print1tn(n-1);
    }
    public static void revArr(int arr[],int i)
    {
        int n=arr.length;
        if(i>=arr.length/2)
        {
            return;
        }
        int t=arr[n-i-1];
        arr[n-i-1]=arr[i];
        arr[i]=t;
        revArr(arr, i+1);
    }
    public static void revStr(String str,int i)
    {
        int n=str.length();
        StringBuilder sb=new StringBuilder(str);
        if(i>=n/2)
        {
            System.out.println(str);
            return;
        }
        char t=sb.charAt(i);
        char x=sb.charAt(n-i-1);
        sb.setCharAt(i,x);
        sb.setCharAt(n-i-1,t);
        revStr(sb.toString(), i+1);
    }
    public static void main(String[] args) {
        // printName("Ram", 5);
        // print1tn(4);
        // printnt1(5);
        // int arr[]={10,20,30,40,50};
        // revArr(arr, 0);
        // for(int i:arr)
        // {
        //     System.out.print(i+" ");
        // }
        String s="Raisoni";
        // System.out.println(s.charAt(0));
        // // "X"=s.charAt(2);
        // System.out.println(s.charAt());
        revStr(s, 0);
    }
}
