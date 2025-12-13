public class Q45AsciiChar {
    public static String getCharacters(String digits)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<digits.length();i+=2)
        {
            int num=Integer.parseInt(digits.substring(i,i+2));
            sb.append((char)num);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
            System.out.println(getCharacters("65666768"));
    }
}
