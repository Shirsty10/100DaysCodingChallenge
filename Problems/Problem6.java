package Problems;
// Find duplicates in a given array when elements are not limited to a range
// Input: {2, 10,10, 100, 2, 10, 11,2,11,2}
// Output: 2 10 11

import java.util.Arrays;

public class Problem6 {
     static int lastEle = 0;
    static void duplicatesInArray(int[] a){
        Arrays.sort(a);
       for(int i=1;i<a.length;i++){
        if(a[i] == a[i-1] && a[i] != lastEle){
            System.out.print(a[i] + " ");
            lastEle = a[i];
        }
       }
       System.out.println();
    }

    public static void main(String[] args){
        int array[] = {2, 10,10, 100, 2, 10, 11,2,11,2};
        duplicatesInArray(array);
    
    }
    
}
