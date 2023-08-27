package Problems;

public class Problem91 {

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return calculateWays(n, dp);
    }
    
    private static int calculateWays(int n, int[] dp) {
        if (n == 1 || n == 2) {
            return n;
        }
        
        if (dp[n] != 0) {
            return dp[n];
        }
        
        dp[n] = calculateWays(n - 1, dp) + calculateWays(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args){
        int ans = climbStairs(3);
        System.out.println(ans);
    }
    
}
