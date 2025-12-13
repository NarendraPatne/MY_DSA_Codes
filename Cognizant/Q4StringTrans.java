public class Q4StringTrans {
    public static int transformStringCost(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c : s1.toCharArray()) {
            freq1[c - 'A']++;
        }
        for (char c : s2.toCharArray()) {
            freq2[c - 'A']++;
        }
        int cost = 0;
        for (int i = 0; i < 26; i++) {
            if (freq2[i] > freq1[i]) {
                cost = cost + freq2[i] - freq1[i];
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        String S1 = "ABD";
        String S2 = "AABCCAD";
        System.out.println(transformStringCost(S1, S2));
    }
}
