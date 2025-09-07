public class Jump_Game{
    public boolean solution(int[] nums){
        int maxReach=0;
        for ( int i = 0 ; i<nums.length;i++){
            if (i>maxReach) return false;
            maxReach=Math.max(maxReach,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        Jump_Game jg=new Jump_Game();
        int[] nums={2,3,1,1,4};
        System.out.println(jg.solution(nums));
        int[] nums2={3,2,1,0,4};
        System.out.println(jg.solution(nums2));
        int[] nums3={0};
        System.out.println(jg.solution(nums3));
    }
}