package Problems;

import java.util.Arrays;

public class Problem96 {
     public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(m, n, dp);
    }

    static int helper(int m, int n, int[][] dp) {
        if(m == 1 && n == 1) {
            return 1;
        } 

        if(dp[m][n] != -1) {
            return dp[m][n];
        }

        int count = 0;
        if(n >= 1) {
            count += helper(m, n-1, dp);
        }
        if(m >= 1) {
            count += helper(m-1, n, dp);
        }

        dp[m][n] = count;

        return dp[m][n];
    }

   public static void main(String[] args){
     int ways = uniquePaths(3,7);

     System.out.println(ways);
   }
    
}
