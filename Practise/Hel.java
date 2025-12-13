public class Hel {
    public static void main(String[] args) {
        String s="ahhellllldoou";
        String s1="hello";
        int j=0,count=0;
        for(int i=0;i<s.length() && j<s1.length();i++)
        {
            if(s.charAt(i)==s1.charAt(j))
            {
                count++;
                j++;
            }
        }
        if(count==5)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
