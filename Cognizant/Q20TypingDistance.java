public class Q20TypingDistance {
    public static int getTypingDistance(String text)
    {
        int distance=0;
        for(int i=1;i<text.length();i++)
        {
            int curr=text.charAt(i)-'a';
            int prev=text.charAt(i-1)-'a';
            distance+=Math.abs(curr-prev);
        }
        return distance;
    }
    public static void main(String[] args) {
        String text = "cba";
        System.out.println('c'-'a');
        System.out.println(getTypingDistance(text));
    }
}
