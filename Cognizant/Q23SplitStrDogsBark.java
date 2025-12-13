import java.util.HashSet;

public class Q23SplitStrDogsBark {
    public static int distinctDogsBarking(String S) {
        String[] patterns = S.split("\\.+");
        HashSet<String> set = new HashSet<>();
        for (String p : patterns) {
            set.add(p);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String S = "B...B...BB...B....BBB.BB.B.BB.B.BBBB";
        System.out.println(distinctDogsBarking(S)); // Output: 3
    }
}
