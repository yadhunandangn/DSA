public class JumpGame2 {


    public int jump(int[] nums) {
        int jumps = 0, end = 0, farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == end) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }


    public static void main(String[] args) {
        JumpGame2 jg2 = new JumpGame2();
        int[] nums = { 2, 3, 1, 1, 4 };
        System.out.println(jg2.jump(nums));

        int[] nums2 = { 2, 3, 0, 1, 4 };
        System.out.println(jg2.jump(nums2));

        int[] nums3 = { 0 };
        System.out.println(jg2.jump(nums3));
    }
}