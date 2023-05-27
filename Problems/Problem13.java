package Problems;
// Given a set of strings, find the longest common prefix.
// Input : { "temp", "temple", "templerun", "temporary" }
// Output : temp


import java.util.Arrays;

public class Problem13 {

    static String longestCommonPrefix(String[] arr) {
        if (arr.length == 0) {
            return "";
        }
        if (arr.length == 1) {
            return arr[0];
        }

        Arrays.sort(arr);
        // find min length
        int minLen = Math.min(arr[0].length(), arr[arr.length - 1].length());

        int i = 0;
        while (i < minLen && arr[0].charAt(i) == arr[arr.length - 1].charAt(i))
            i++;

        return arr[0].substring(0, i);

    }

    public static void main(String[] args) {
        String array[] = { "temp", "temple", "templerun", "temporary" };
        String values = longestCommonPrefix(array);
        System.out.println("Longest Common prefix is " + values);

    }

}
