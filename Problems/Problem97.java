package Problems;

public class Problem97 {
    
    public static void knapsackBounded(int n,int[] wts, int value[], int cap){
        int dp[][] = new int[n+1][cap+1];

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j>= wts[i-1]){
                 int r = j-wts[i-1];

                 if(dp[i-1][r] + value[i-1]>dp[i-1][j]){
                    dp[i][j] = dp[i-1][r] + value[i-1];
                 }else {
                    dp[i][j] = dp[i-1][j];
                 }
                }else{
                    dp[i][j] = dp[i-1][j];
                } 
            }
        }
        System.out.println(dp[n][cap]);
    }
    public static void main(String args[])
    {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int w = 50;
        int n = profit.length;
        knapsackBounded(n, weight, profit, w);
    }
}
