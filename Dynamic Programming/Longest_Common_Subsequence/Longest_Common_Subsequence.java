// problem : longest common subsequence
// link : https://leetcode.com/problems/longest-common-subsequence/
// statement : Given two strings text1 and text2, return the
//length of their longest common subsequence. If there is no common subsequence, return 0.
// A subsequence of a string is a new string generated from the original string
//with some characters (can be none) deleted without changing the relative order of the remaining characters.
// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.



public class Longest_Common_Subsequence{

    public int longestSubstring(String text1,String text2){
        int m = text1.length();
        int n = text2.length();
        int[][ ] dp= new int [m+1][n+1];
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Longest_Common_Subsequence lcs = new Longest_Common_Subsequence();
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(lcs.longestSubstring(text1, text2));

        String text3 = "abc";
        String text4 = "abc";
        System.out.println(lcs.longestSubstring(text3, text4));

        String text5 = "abc";
        String text6 = "def";
        System.out.println(lcs.longestSubstring(text5, text6));
    }
}