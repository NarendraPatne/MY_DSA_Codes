import java.util.Stack;

public class Q25SumPulseSkipCount {
    public static int calculateTotalPulseSkipCount(int n, int[] a) {
        Stack<Integer> stack = new Stack<>();
        int totalSkipCount = 0;
        for (int i = 0; i < a.length; i++) {
            int currSkipCnt = 0;
            while (!stack.isEmpty() && a[i] > stack.peek()) {
                stack.pop();
                currSkipCnt++;
            }
            stack.push(a[i]);
            totalSkipCount += currSkipCnt;
        }
        return totalSkipCount;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] a = { 3, 1, 4, 2, 5, 1 };
        System.out.println(calculateTotalPulseSkipCount(n, a)); // Output: 5
        System.out.println('8'-'0');
        System.out.println("5"+5);
        String s=""+5;
        System.out.println(s);
    }
}
