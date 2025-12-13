public class Q28CountAlphWrapDigits {
    public static int countAlpWrapDigits(String S) {
        int count = 0;
        for (int i = 1; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i - 1)) && Character.isLetter(S.charAt(i))
                    && Character.isDigit(S.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "5aart6i7io8o5o56";
        System.out.println(countAlpWrapDigits(s));
    }
}
