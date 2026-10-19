import java.util.*;
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
    public static boolean sortedArray(int []arr,int i)
    {
        if(i>arr.length-1) return true;
        if(arr[i-1]>arr[i]) return false;
        return sortedArray(arr, i+1);
    }
    public static int linearS(int []arr,int target,int i)
    {
        if(i>arr.length-1) return -1;
        if(arr[i]==target) return i;
        return linearS(arr, target, i+1);
    }
    public static void skipChar(String s,char c,int i,String ans){
        if(i>s.length()-1){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)==c) skipChar(s, c, i+1, ans);
        else{
            ans+=s.charAt(i);
            skipChar(s, c, i+1, ans);
        }
    }
    public static void printSubseq(String s,String ans,int i){
        if(i>=s.length())
        {
            System.out.println(ans);
            return;
        }
        // Not Choose
        printSubseq(s, ans, i+1);
        // choose
        ans+=s.charAt(i);
        printSubseq(s, ans, i+1);
       }

    public static void printASubseq(int arr[],List<Integer> list,int i)
    {
        if(i>arr.length-1)
        {
            System.out.println(list);
            return;
        }
        // skip
        printASubseq(arr, list, i+1);
        // pick
        list.add(arr[i]);
        printASubseq(arr, list, i+1);
        // Remove the element we just printed
        list.remove(list.size()-1);
    }
    public static void stringPermutations(String ansStr,String mainStr)
    {
        // Base Case
        if(mainStr.isEmpty())
        {
            System.out.println(ansStr);
            return;
        }
        char ch=mainStr.charAt(0);
        // Iterate through each index and swap
        for(int i=0;i<=ansStr.length();i++)
        {
            String f=ansStr.substring(0,i);
            String l=ansStr.substring(i,ansStr.length());
            String a=f+ch+l;
            stringPermutations(a, mainStr.substring(1));
        }
    }
    public static void arrPermutations(int arr[],int ind)
    {
        if(ind>=arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        // loop from curr ind to end and swap curr ind with each next element
        for(int i=ind;i<arr.length;i++)
        {
            swaP(arr,ind,i);
            arrPermutations(arr, ind+1);
            swaP(arr,ind,i);
        }
    }
    public static void swaP(int arr[],int x,int y)
    {
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }
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
        // System.out.println(countZeros(1234));
        // int arr[]={1,1,2,0,5,3,2,3,43,5,6,76};
        // System.out.println(sortedArray(arr, 1));
        // System.out.println(linearS(arr, 76, 0));
        // skipChar("Narendra", 'a', 0, "");
        // printSubseq("abc", "", 0);
        // List<Integer>list=new ArrayList();
        // int arr[]={1,2,3,4};
        // printASubseq(arr, list, 0);
        // arrPermutations(arr, 0);
        stringPermutations("", "abc");
    }
}