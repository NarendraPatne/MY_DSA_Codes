import java.math.*;
public class TrappingRain {
    public static void calcTrappedWater(int height[])
    {
        int e=height.length;
        int leftmax[]=new int[e];
        int rightmax[]=new int[e];
        
        leftmax[0]=height[0];
        System.out.println(leftmax[0]);
        rightmax[e-1]=height[e-1];
        System.out.println(rightmax[e-1]);
        int waterL,trappedW=0;
        System.out.print(leftmax[0]+" ");
        for(int i=1;i<e;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
            System.out.print(leftmax[i]+" ");
        }
        System.out.println();
        System.out.print(rightmax[e-1]+" ");
        for(int i=e-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
            System.out.print(rightmax[i]+" "); // Note storing in proper order but printed in reverse order
        }
        System.out.println();
        for(int i=0;i<e;i++)
        {
            waterL=Math.min(leftmax[i], rightmax[i]);
            trappedW=trappedW+(waterL-height[i]);
        }
        System.out.println("Trapped Water is: "+trappedW+" Units");
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        calcTrappedWater(height);
    }
}
