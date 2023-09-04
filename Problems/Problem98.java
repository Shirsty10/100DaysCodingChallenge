package Problems;

public class Problem98 {

    public static void maxSumNonAdjEle(int[] arr){
        int inc = arr[0];
        int exc =0;

        for(int i=1;i<arr.length;i++){
          int next = exc +arr[i];
          int nextexc = Math.max(inc,exc);

          inc = next;
          exc = nextexc;
        }
        System.out.println(Math.max(inc,exc));
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        maxSumNonAdjEle(nums);
    }
    
}
