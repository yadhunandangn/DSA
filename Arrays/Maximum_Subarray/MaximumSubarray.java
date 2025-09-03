
public class MaximumSubarray{
    public int maxSubArray(int[] nums){
        int currMax = nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(max, currMax);
        }
        return max;
    }

    public static void main(String[] args){
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(nums));
    }
}