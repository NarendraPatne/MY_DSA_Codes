public class Q9UniquemapDecode {
    public static int countMappings(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            int num1=s.charAt(i)-'0';
            if(num1>=1 && num1<=26)
            {
                count++;
            } 
            if(i+1<s.length())
            {
                int num2=Integer.parseInt(s.substring(i, i+2));
                if(num2>=1 && num2<=26)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countMappings("11292"));
    }
}
