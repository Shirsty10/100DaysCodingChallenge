package Problems;
public class Problem94 {

    public static void coinChange(int val,int[] coins){
        int[] dp = new int[val+1];
        dp[0] = 1;

        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<dp.length;j++){
                dp[j] += dp[j-coins[i]];
            }
        }

        System.out.println(dp[val]);
    }

      // Driver code
      public static void main(String args[])
      {
          int coins[] = { 1, 2, 3 };
        //   int n = coins.length;
   
          coinChange(4, coins);
      }
    
}
