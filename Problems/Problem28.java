package Problems;

import java.util.Arrays;

public class Problem28 {
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
          int maxPairSum=0;
          for(int i=0;i<=nums.length/2;i++){
              maxPairSum=Math.max(maxPairSum, nums[i] + nums[nums.length-1-i] );
          }
          return maxPairSum;
    }
    public static void main(String[] args)
    {
        int mat[] = {3,5,2,3};
         
        int ans = minPairSum(mat);
        System.out.println("Minimize Maximum Pair Sum in Array : " + ans);
      
    }
}
