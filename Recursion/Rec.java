public class Rec {
    public static void printN(int n)
    {
        // Tail Racursion
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        printN(n-1);
    }
    public static void printR(int n)
    {
        // Head Recursion
        if(n==0)
        {
            return;
        }
        printR(n-1);
        System.out.print(n+" ");
    }
    public static int facto(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int factnm=facto(n-1);
        int factn=n*factnm;
        return factn;
    }
    public static int SumN(int n)
    {
        // if(n==1)
        // {
        //     return 1;
        // }
        // return n+SumN(n-1);
        if(n==1)
        {
            return 1;
        }
        int Snm1=SumN(n-1);
        int Sumn=n+Snm1;
        return Sumn;
    }
    // ----------------------------------------------------------------
    // Nth Fibonacci Number
    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int fibn=fibonacci(n-1)+fibonacci(n-2);
        // System.out.println(fibn);
        return fibn;
    }
    // We pass array and position of current comparison 
    public static boolean isArrSorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false; 
        }
        return isArrSorted(arr, i+1);
    }
    public static void printFibsnloop(int n)
    {
        int fir=0,sec=1;
        int fib=0;
        System.out.print(fir+" "+sec+" ");
        for(int i=2;i<=n;i++)
        {
            fib=fir+sec;
            System.out.print(fib+" ");
            fir=sec;
            sec=fib;
        }
    }
    public static int firstOcc(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOcc(arr, key, i+1); 
    }
    public static int lastOcc(int arr[],int key,int i)
    {
        if(i==-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return lastOcc(arr, key, i-1);
    }
    // Brute Force approach to get X to Power N
    // This function takes O(n) time complexity
    // Lots of function call levels equal to n 
    public static int nPow(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        int nm1p=nPow(x, n-1);
        return x*nm1p;
    }
    // Optimised approach to get X to power N
    // Less function call levels equal to log n
    public static int nPowOp(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        // Here we are dividing the no of function calls in two parts with n/2 calls each.
        // int halfPow=nPowOp(x, n/2)*nPowOp(x, n/2);
        // if n is odd then we add one more power to make the power equal to n
        // But above approach also has no of function calls equal to n
        // To make computation faster we just calculate the half power and calculate its square
        int halfPow=nPowOp(x, n/2);
        int halfPowsq=halfPow*halfPow;
        if(n%2==1)
        {
            // halfPow=halfPow*x;
            halfPowsq=halfPowsq*x;
        }
        return halfPowsq;
    }
    public static int tilingProblem(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        // vertical
        int verticalWays=tilingProblem(n-1);
        // horizontal
        int horizonttalWays=tilingProblem(n-2);
        // total ways with vertical and horizontal ways 
        return horizonttalWays+verticalWays;
    }
    public static void removeDupStr(String mStr,StringBuilder nStr,boolean map[],int i)
    {
        // Base Case
        if(i==mStr.length())
        {
           System.out.println(nStr);
           return;
        }
        // Work
        char currC=mStr.charAt(i);
        // System.out.println(currC);
        int currInd=currC-'a';
        if(map[currInd]==false)
        {
            map[currInd]=true;
            nStr.append(currC);
        }
        removeDupStr(mStr,nStr,map,i+1);
        return;
    }
    public static void main(String[] args) {
        // printN(10);
        // System.out.println();
        // printR(10);
        // System.out.println();
        // System.out.println(facto(4));
        // System.out.println(SumN(5));
        // System.out.println(fibonacci(10));
        // printFibsnloop(10);
        // int arr[]={10,20,30,40,50,30,70,80};
        // System.out.println(isArrSorted(arr, 0));
        // System.out.println(firstOcc(arr, 30, 0));
        // System.out.println(lastOcc(arr, 30, arr.length-1));
        // System.out.println(nPow(2, 10));
        // System.out.println(nPowOp(2, 10));
        // System.out.println(tilingProblem(4 ));
        // String s="abcd";
        // System.out.println(s.length());
    }
}
