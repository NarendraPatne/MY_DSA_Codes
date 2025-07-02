public class StrCompress {
    public static String compressStr(String str)
    {
        StringBuilder sb=new StringBuilder("");
        System.out.println("-----------------------------");
        for(int i=0;i<str.length();i++)
        {
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
                // System.out.println(i+" "+count);
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(Integer.toString(count));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(compressStr(str));
    }
}
