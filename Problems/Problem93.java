package Problems;

public class Problem93 {

    public static boolean subsetSum(int subset[],int n,int tar){
        boolean[][] dp = new boolean[n+1][tar+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j] = true;
                }else if(i==0){
                    dp[i][j] = false;
                }else if(j==0){
                    dp[i][j] = false;
                }else{
                    if(dp[i-1][j] == true){
                        dp[i][j] = true;
                    }else{
                        int val = subset[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        return dp[n][tar];
    }

    public static void main(String args[])
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if (subsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                               + " with given sum");
        else
            System.out.println("No subset with"
                               + " given sum");
    }
    
}
