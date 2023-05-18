package Problems;

import java.util.Arrays;

public class Problem5 {
    
    static int[] kthLargestAndSmallest( int[] a, int k){
     int [] ans = new int[2];

     Arrays.sort(a);
     ans[0] = a[a.length-k];
     ans[1] = a[k-1];

     return ans;
    }
    public static void main(String[] args){
        int array[] = {7, 10, 4, 3, 20, 15};
        int values[] = kthLargestAndSmallest(array, 3);
        System.out.println("Kth Largest value is " + values[0] + " and Kth smallest value is " + values[1]);
    
    }
}
