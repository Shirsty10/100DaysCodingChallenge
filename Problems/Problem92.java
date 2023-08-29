package Problems;

public class Problem92 {

    public static void minCostPath(int[][] val,int n,int m){
        int[][] dp = new int[n][m];

        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
                if(i== dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = val[i][j];
                }else if(i==dp.length-1){
                    dp[i][j] = dp[i][j+1]+val[i][j];
                }else if(j==dp[0].length-1){
                    dp[i][j] = dp[i+1][j] + val[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])+ val[i][j];
                }
                
            }
        }
        System.out.println(dp[0][0]);
    }

    public static void main(String args[])
    {
 
        int cost[][]
            = { {1,3,1},{1,5,1},{4,2,1} };
 
      minCostPath(cost, 2, 2);
    }
    
}
