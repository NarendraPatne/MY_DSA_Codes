import java.util.Arrays;
public class Practise{
    // Print 1 to n using recursion
    public static void printN(int n)
    {
        if(n==0) return;
        printN(n-1);
        System.out.println(n);
    }
    public static int sumN(int n)
    {
        if(n==0) return 0;
        return n+sumN(n-1);
    }
    public static void sumN2(int n,int sum)
    {
        if(n<1) 
        {
            System.out.println("Sum is:"+sum);
            return;
        }
        sumN2(n-1, sum+n);
    }
    public static int multN(int n)
    {
        if(n==0) return 1;
        return n*multN(n-1);
    }
    public static void printName(String name,int n)
    {
        if(n==0) return;
        System.out.println(name);
        printName(name, n-1);
    }
    public static void printNt(int n)
    {
        if(n==0) return;
        System.out.println(n);
        printNt(n-1);
    }
    public static void printIN(int i,int n)
    {
        if(i>n) return;
        System.out.println(i);
        printIN(i+1, n);
    }
    static int arr[]={45,65,76,87,98,23};
    static int n=arr.length;
    public static void reverseArr(int l,int r)
    {
        if(l>r) return;
        swap(l,r);
        reverseArr(l+1, r-1);
    }
    public static void reverseOp(int i)
    {
        if(i>=n/2) return;
        swap(i, n-1-i);
        reverseOp(i+1);
    }
    public static void swap(int l,int r)
    {
        int t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;
    }
    public static boolean isStrPalindrome(String s,int l,int r)
    {
        if(s.charAt(l)!=s.charAt(r)) return false;
        if(l>=r) return true;
        return isStrPalindrome(s, l+1, r-1);
    }
    public static int nthFibo(int n)
    {
        if(n<=1) return n;
        return nthFibo(n-1)+nthFibo(n-2);
    }
    public static int countZeros(int num)
    {
        if(num==0) return 0;
        int x=(num%10)==0?1:0;
        return x+countZeros(num/10);
    }
    public static 
    public static void main(String[] args) {
        // printN(10);
        // System.out.println(sumN(2));
        // System.out.println(multN(6));
        // printName("Narendra", 5);
        // printNt(10);
        // printIN(1, 5);
        // sumN2(5, 0);
        // System.out.println(Arrays.toString(arr));
        // // reverseArr(0, arr.length-1);
        // reverseOp(0);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(isStrPalindrome("TENT", 0, 3));
        // System.out.println(nthFibo(3));
        System.out.println(countZeros(1234));
    }
}