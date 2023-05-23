package Problems;
// Pair with given sum in a sorted array
// Input: n = 7
// arr[] = {1, 2, 3, 4, 5, 6, 7}, K = 8
// Output: 3
// Explanation: We find 3 such pairs that sum to 8 (1,7) (2,6) (3,5)

import java.util.HashMap;

public class Problem10 {

    static int Countpair(int a[], int n, int sum) {
        int count = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int val : a) {
            map.put(val, true);
        }

        for (int i = 0; i < a.length / 2; i++) {

            if (map.containsKey(sum - a[i]) && map.get(a[i]) == true && map.get(sum - a[i]) == true
                    && a[i] != (sum - a[i])) {
                count++;
                map.put(a[i], false);
                map.put(sum - a[i], false);
                // System.out.println("(" + a[i] + "," + (sum-a[i]) + ")");
            }
        }

        if (count == 0) {
            count = -1;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int K = 8;
        int count = Countpair(arr, n, K);
        System.out.println("Pair count is : "+ count);

    }
}
