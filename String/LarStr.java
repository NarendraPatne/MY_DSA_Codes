public class LarStr {
    public static String getLargestStr(String []strs)
    {
        String lstring=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            if(lstring.compareTo(strs[i])<0)
            {
                lstring=strs[i];
            }
        }
        return lstring;
    }
    public static void main(String[] args) {
        String fruits[]={"apple","banana","mango"};
        System.out.println(getLargestStr(fruits));
    }
}
