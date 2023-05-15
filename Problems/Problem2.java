package Problems;
// Find minimum and maximum element in an array
// Input:
// N = 6
// A[] = {3, 2, 1, 56, 10000, 167}
// Output:
// min = 1, max =  10000
// Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

public class Problem2 {
    static long[] getMinMax(long a[], long n)  
    {
        long[] ans = new long[2];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]> max){
                max=a[i];
            }
            if(a[i]<min){
                min = a[i];
            }

        }

        ans[0] = max;
        ans[1] = min;

        return ans;
       
    }
    public static void main(String[] args){
        long array[] = {3, 2, 1, 56, 10000, 167};
        long values[] = getMinMax(array, array.length);
        System.out.println("Maximum value is " + values[0] + " and Minimum value is " + values[1]);
    
    }
}
