public class Container_With_Most_Water{
    public int maxArea(int[] height){
        int max=0;
        int left = 0;
        int right = height.length-1;
        while(left<right)
        {
            int width = right-left;
            int water =Math.min(height[left] , height[right])*width;
            max=Math.max(max,water);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Container_With_Most_Water cw = new Container_With_Most_Water();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = cw.maxArea(height);
        System.out.println(result);
    }
}
