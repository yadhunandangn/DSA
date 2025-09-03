import java.util.*;
public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> res = new HashMap<>();
        for (int i =0 ; i<nums.length-1;i++){
            if(res.containsKey(target-nums[i])){
                return new int[]{res.get(target-nums[i]), i};
            }
            res.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
    }
}