// Unique Paths - Matrix Chain Multiplication
// leetcode problem number : 62
// link : https://leetcode.com/problems/unique-paths/
// statement : A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
// The robot can only move either down or right at any point in time.
// The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
// How many possible unique paths are there?
 class Unique_Paths_{
    public int paths(int m , int n){
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0]=1;
        for(int j=0;j<n;j++) dp[0][j]=1;

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }

        System.out.println("The paths for each position");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return dp[m-1][n-1];
    }



    public static void main(String[] args){
        Unique_Paths_ paths=new Unique_Paths_();
        int numberofPaths = paths.paths(3, 7);
        System.out.println(numberofPaths);
    }
 }