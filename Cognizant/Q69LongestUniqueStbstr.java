import java.util.HashMap;

public class Q69LongestUniqueStbstr {
    public static int getLongestUniqueSubstrLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int longestLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            if (map.containsKey(curr)) {
                left = Math.max(map.get(curr) + 1, left);
            }
            map.put(curr, right);
            longestLength = Math.max(longestLength, right - left + 1);
        }
        return longestLength;
    }

    public static void main(String[] args) {
        String input = "abcdddabcbb";
        System.out.println(getLongestUniqueSubstrLength(input));
    }
}