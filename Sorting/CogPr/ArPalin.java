public class ArPalin {
    static boolean isPalin(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        if(rev.equals(s))return true;
        return false;
    }
    static boolean isPalin2(String s)
    {
        int left=0,right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String []array={"tenet","adfoja","madam"};
        for(String s:array)
        {
            if(isPalin2(s))
            {
                System.out.println(s);
            }
        }
    }
}
