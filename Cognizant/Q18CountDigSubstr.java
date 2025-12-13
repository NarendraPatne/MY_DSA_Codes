public class Q18CountDigSubstr {
    public static int countDigitSubstrings(String S) {
        int count = 0;
        int n = S.length();

        for (int i = 0; i < n; i++) {
            // Check if current character is a digit and it's the start of a new sequence
            if (Character.isDigit(S.charAt(i)) && (i == 0 || !Character.isDigit(S.charAt(i - 1)))) {
                int start = i;
                // Move to the end of the sequence
                while (i + 1 < n && Character.isDigit(S.charAt(i + 1))) {
                    i++;
                }
                int end = i;

                // Check if sequence is surrounded by letters
                if (start > 0 && end < n - 1) {
                    if (Character.isLetter(S.charAt(start - 1)) && Character.isLetter(S.charAt(end + 1))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String S = "a123d2f";
        System.out.println(countDigitSubstrings(S)); // Output: 1
    }
}
