package Problems;
//Given an array a[]. The task is to find the sum of the contiguous subarray within a a[] with the largest sum. 
// Input : {-2, -3, 4, -1, -2, 1, 5, -3}
// Output : Maximum contiguous sum is 7

public class Problem8 {

    static int largetSumSubarray(int[] a){
    
        //kadane's algo
    
        int max =a[0],maxCount = a[0];
        for(int i=1;i<a.length;i++){
            max = Math.max(a[i],max+a[i]);
            maxCount = Math.max(maxCount,max);
        } 

        return maxCount;
    }
    public static void main(String[] args){
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int values = largetSumSubarray(array);
        System.out.println("Largest Sum Subarray is " + values );
    
    }
    
}
