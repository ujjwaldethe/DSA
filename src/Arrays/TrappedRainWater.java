package Arrays;

public class TrappedRainWater {
    public static int trappedRainWater(int height[])
    {
        int trappedWater=0;
        //calculate left max boundary
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        System.out.print("\nLeftmax Array : ");
        for(int i=1;i<height.length;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
            System.out.print(leftmax[i]+" ");
        }
        //calculate right max boundary
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];

        for(int i=height.length-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax [i+1]);

        }
        System.out.print("\nRightmax Array : ");
        for (int i=0;i<rightMax.length-1;i++)
        {
            System.out.print(rightMax[i]+" ");
        }
        //loop
        System.out.println();
        for(int i=0;i<height.length;i++){
            int wateLevel=Math.min(leftmax[i],rightMax[i]);
            System.out.println("Water Level = Minimum("+leftmax[i]+","+rightMax[i]+")");
            System.out.println("Water Level : "+wateLevel);
            System.out.println("Trapped Water Is : TrappedWater +"+trappedWater+" Water Level : "+wateLevel+" - Height : "+height[i]);
            trappedWater +=wateLevel-height[i];
            System.out.println("Trapped Water Status : "+trappedWater);
        }
        return trappedWater;
        //waterlevel = min(leftmax bound,rightmax bound
    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        System.out.print(trappedRainWater(height));
    }
}
