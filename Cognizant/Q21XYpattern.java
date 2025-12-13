public class Q21XYpattern {
    public static int countStepstoConvertStr(String s) {
        int diffx = 0, diffy = 0;
        for (int i = 0; i < s.length(); i++) {
            char xExp = i % 2 == 0 ? 'X' : 'Y';
            char yExp = i % 2 == 0 ? 'Y' : 'X';
            if (s.charAt(i) != xExp) {
                diffx++;
            }
            if (s.charAt(i) != yExp) {
                diffy++;
            }
        }
        return Math.min(diffx, diffy);
    }

    public static void main(String[] args) {
        String S = "XXYXYY";
        System.out.println(countStepstoConvertStr(S));
    }
}