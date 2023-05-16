package Problems;
// Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
// Output: Sum found between indexes 1 and 4
// Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

public class Problem3 {
    
    static int[] subArayWithgivenSum( int[] a, int num){
        int[] ans = new int[2];
        int start = 0;
        int end = 1;
        int sum =a[0];
        while(end<a.length){
            if(sum>num){
                sum= sum-a[start];
                start++;
            }else if(sum<num){
                sum  = a[end]+sum;
                end++;
            }else {
                end = end-1;
                break;
            }
            

        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    public static void main(String[] args){
        int array[] = {1, 4, 20, 3, 10, 5};
        int values[] = subArayWithgivenSum(array, 33);
        System.out.println("Sum found between indexes " + values[0] + " and " + values[1]);
    
    }
}
