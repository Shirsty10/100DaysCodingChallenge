package Problems;
// Rotate an array of n elements to the right by k steps. 
// Input :  n= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

public class Problem11 {
    
    static void rotateArray(int[] a, int k){
       reverse(0, a.length-k-1, a);
       reverse(a.length-k, a.length-1, a);
       reverse(0, a.length-1, a);

       for(int val : a){
        System.out.print(val + " ");
       }
    }

    static void reverse(int start,int end, int[] a){
        while(start<=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int array[] = {0,1,2,3,4,5,6};
        int order =3;
        rotateArray(array,order);
    
    }
}
