// Longest Increasing Subsequence
// link : https://leetcode.com/problems/longest-increasing-subsequence/
// statement : Given an integer array nums, return the length of the longest strictly increasing subsequence.
// A subsequence is an array that can be derived from another array by deleting some or no elements
// without changing the order of the remaining elements.
//For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
// Example 1:
// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
// Example 2:
// Input: nums = [0,1,0,3,2,3]
// Output: 4
// Explanation: The longest increasing subsequence is [0,1,2,3], therefore the length is 4.
// Example 3:
// Input: nums = [7,7,7,7,7,7,7]
// Output: 1
// Explanation: The longest increasing subsequence is [7], therefore the length is 1.

import java.util.*;
class Longest_Increasing_Subsequence {

    public int SubseqCount(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 1;i<n;i++){
            for (int j =0;j<i;j++){
                if(nums[i]>nums[j])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int maxlen=0;
        for(int len : dp) maxlen=Math.max(len,maxlen);
        return maxlen;
    }

    public static void main(String[] args) {
        Longest_Increasing_Subsequence lis = new Longest_Increasing_Subsequence();
        int[] nums1 = {10,9,2,5,3,7,101,18};
        System.out.println(lis.SubseqCount(nums1));

        int[] nums2 = {0,1,0,3,2,3};
        System.out.println(lis.SubseqCount(nums2));

        int[] nums3 = {7,7,7,7,7,7,7};
        System.out.println(lis.SubseqCount(nums3));
    }
}

