package Problems;
// Union and Intersection of two sorted arrays
// Input: arr1[] = {1, 3, 4, 5, 7}
//         arr2[] = {2, 3, 5, 6} 
// Output: Union : {1, 2, 3, 4, 5, 6, 7} 
//          Intersection : {3, 5}

import java.util.ArrayList;

public class Problem4 {
    
   static void unionAndIntersection(int[] a1,int[] a2){
       int p1= 0;
       int p2 =0;

       ArrayList<Integer> union = new ArrayList<>();
       ArrayList<Integer> intersection = new ArrayList<>();

       while(p1<a1.length && p2<a2.length){
        if(a1[p1]<a2[p2]){
          union.add(a1[p1]);
          p1++;
        }else if(a1[p1]>a2[p2]){
            union.add(a2[p2]);
            p2++;
        }else{
            union.add(a1[p1]);
            intersection.add(a1[p1]);
            p1++;
            p2++;
        }
       }

     
          while(p1< a1.length){
            union.add(a1[p1]);
            p1++;
          }
       

        while(p2< a2.length){
          union.add(a2[p2]);
          p2++;
        }


     System.out.println("Union : " + union);
     System.out.println("Intersection : " + intersection);
    }

    public static void main(String[] args){
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        
        unionAndIntersection(arr1, arr2);
    
    }
}
