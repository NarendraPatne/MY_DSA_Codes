public class WFLupp {
    public static String confirstLUpp(String str)
    {
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ' && i<str.length()-1){
                sb.append(ch);
                i++;
                ch=str.charAt(i);
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String st="hi, i am narendra";
        System.out.println(confirstLUpp(st));
    }
}
