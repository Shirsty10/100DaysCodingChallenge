package Problems;

// Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers,
//  the consecutive numbers can be in any order. 
// Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
// Output: 4
// Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements

import java.util.HashMap;

public class Problem9 {

    static void longestSubSequence(int[] a){
        //using Hashing

        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int val : a){
            map.put(val,true);
        }

        for(int val : a){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }

        int maxlength =0;
        int maxPoint =0;

        for(int val : a){
            if(map.get(val) == true){
                int tempLen = 1;
                int tempPoint = val;

                while(map.containsKey(tempPoint+tempLen)){
                    tempLen++;
                }

                if(tempLen>maxlength){
                    maxPoint = tempPoint;
                    maxlength = tempLen;
                }
            }
        }
        System.out.println("Max length is : " +maxlength);

        for(int i=0;i<maxlength;i++){
            System.out.print(maxPoint+i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int array[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        longestSubSequence(array);
       
    
    }
    
}
