import java.util.HashSet;

public class Q26CountAsciiDigOcc {
    public static int getCountCharAsciiPresent(int N, int[] A, String S) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }
        int count = 0;
        for (char c : S.toCharArray()) {
            int ascii = (int) c;
            String stringAscii = "" + ascii;
            for (char digChar : stringAscii.toCharArray()) {
                int digit = digChar - '0';
                if (set.contains(digit)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = { 1, 6, 4, 3, 6, 5 };
        String S = "ABCDEF";
        System.out.println(getCountCharAsciiPresent(6, A, S));
    }
}
