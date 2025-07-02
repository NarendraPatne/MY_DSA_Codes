public class TrappingRainwater {
    public static int TRW(int arr[])
    {
        int s=arr.length;
        //Calculting max height of left side for every building
        int leftMax[]=new int[s];
        leftMax[0]=arr[0];
        for(int i=1;i<s;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1], arr[i]);
        }
        //Calculating max height for every building o right side
        int rightMax[]=new int[s];
        rightMax[s-1]=arr[s-1];
        for(int i=s-2;i>=0;i--)
        {
            rightMax[i]=Math.max(rightMax[i+1], arr[i]);
        }
        int trappedW=0;
        for(int i=0;i<s;i++)
        {
            trappedW+=Math.min(leftMax[i], rightMax[i])-arr[i];
        }
        return trappedW;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapped water is:"+TRW(arr));
    }
}