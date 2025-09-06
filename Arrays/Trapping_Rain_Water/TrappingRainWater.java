class TrappingRainWater{
    public int trap(int[] height){
        int left=0;
        int right=height.length-1;
        int leftMax=0,rightMax=0;
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                    ++left;
                    leftMax=Math.max(leftMax,height[left]);
                    water+=leftMax-height[left];
            }

            else{
                --right;
                rightMax=Math.max(rightMax,height[right]);
                water+=rightMax-height[right];
            }
        }   return water;
    }

    public static void main(String[] args) {
        TrappingRainWater trw=new TrappingRainWater();
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trw.trap(height));
    }
}