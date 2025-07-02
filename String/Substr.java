public class Substr {
    public static String getSubStr(String str,int s,int e)
    {
        String ss="";
        for(int i=s;i<e;i++)
        {
            ss+=str.charAt(i);
        }
        return ss;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(getSubStr(str, 0, 5));
    }
}
