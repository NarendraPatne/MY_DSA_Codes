public class Q42CountNofOcc {
    public static int getCountofOcc(String string1,String string2)
    {
        int prevLen=string1.length();
        String[] split=string1.split(string2);
        String join=String.join("",split);
        int newLen=join.length();
        int diff=prevLen-newLen;
        return diff/string2.length();
    }
    public static void main(String[] args) {
        String s="Always Joe in Friends Joe with Joe Joe Joe Joe";
        System.out.println(getCountofOcc(s, "Joe"));
    }
}
