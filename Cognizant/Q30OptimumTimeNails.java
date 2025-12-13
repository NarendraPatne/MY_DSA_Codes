public class Q30OptimumTimeNails {
    public static int getOptimumTimetoDriveNails(int N, int X, int[] S) {
        int singleModeTime = 0;
        int maxNailSize = 0;
        for (int i = 0; i < S.length; i++) {
            singleModeTime += Math.ceilDiv(S[i], X);
            maxNailSize = Math.max(maxNailSize, S[i]);
        }
        int multiModeTime = maxNailSize;
        return Math.min(singleModeTime, multiModeTime);
    }

    public static void main(String[] args) {
        int N = 5;
        int X = 4;
        int[] S = { 2, 2, 4, 1, 1 };
        System.out.println(getOptimumTimetoDriveNails(N, X, S));
    }
}
