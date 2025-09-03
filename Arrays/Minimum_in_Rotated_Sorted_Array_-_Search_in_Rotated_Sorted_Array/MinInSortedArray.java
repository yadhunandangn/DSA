public class MinInSortedArray{
   public int findmin(int[] nums){
    int left=0;
    int right=nums.length-1;
    while(left<right){
        int mid = left + (right-left)/2;
        left  = (nums[mid] > nums[right]) ? mid + 1 : left;
        right = (nums[mid] > nums[right]) ? right : mid;
    }
    return nums[left];
   }
    public static void main(String[] args){
     MinInSortedArray ms = new MinInSortedArray();
     int[] nums = {4,5,6,7,0,1,2};
     System.out.println(ms.findmin(nums));
    }
}