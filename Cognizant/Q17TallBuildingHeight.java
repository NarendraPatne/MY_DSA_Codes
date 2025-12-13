public class Q17TallBuildingHeight {
    public static int getTotalHeightTallBuildings(int N, int[] H, int D) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            boolean leftFlag = (i - D < 0) || (H[i - D] < H[i]);
            boolean rightFlag = (i + D >= N) || (H[i + D] < H[i]);
            if (leftFlag && rightFlag) {
                total += H[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] H = { 1, 3, 2, 1, 5, 4 };
        int D = 2;
        System.out.println(getTotalHeightTallBuildings(H.length, H, D));
    }
}
