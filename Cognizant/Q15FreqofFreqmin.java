import java.util.*;

public class Q15FreqofFreqmin {
    public static int getMinFreqofFreq(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int i : map.values()) {
            fmap.put(i, fmap.getOrDefault(i, 0) + 1);
        }
        int maxCount = -1, resFreq = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> e : fmap.entrySet()) {
            int freq = e.getKey();
            int count = e.getValue();
            if (count > maxCount || (count == maxCount && freq < resFreq)) {
                maxCount = count;
                resFreq = freq;
            }
        }
        return resFreq;
    }

    public static void main(String[] args) {
        int N = 20;
        String S = "ACABDDABDCDACFAEGFDA";
        System.out.println(getMinFreqofFreq(S));
        System.out.println((int)Math.ceil(2.1));
    }
}
