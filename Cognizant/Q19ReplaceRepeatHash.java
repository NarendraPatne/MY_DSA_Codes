public class Q19ReplaceRepeatHash {
    public static String replaceConsecutiveChar(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;

        while(i < n) {
            char current = s.charAt(i);
            int count = 1;

            // Count consecutive occurrences of the current character
            while(i + count < n && s.charAt(i + count) == current) {
                count++;
            }

            if(count >= 2) {
                // Append '#' only if it's not already the last character in result
                if(result.length() == 0 || result.charAt(result.length() - 1) != '#') {
                    result.append('#');
                }
            } else {
                // Append the character if it's not repeated
                result.append(current);
            }

            // Move to the next group
            i += count;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String S = "aabbbccdeeea";
        System.out.println(replaceConsecutiveChar(S)); // Output: "#cde#a"
    }
}
