public class Q67ContainerMostWater {
    public static int getContainerWithMostWAterArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int currHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width * currHeight);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(getContainerWithMostWAterArea(height));
    }
}
