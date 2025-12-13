public class Q50Palindrome {
    public static boolean isPalindrome(int num)
    {
        String str=""+num;
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(454543));
    }
}
