package Problems;

import java.util.Arrays;

public class Problem7 {

   static int lowerIndex(int[]a ,int x){
      int lo= 0;
      int hi = a.length-1;
      int ans =-1;

      while(lo<=hi){
        int mid = (hi+lo)/2;
        if(a[mid] >= x){
          ans = mid;
          hi = mid-1;
        }else{
         lo = mid+1;
        }
      }
      return ans;
    }

    static int UpperIndex(int[]a ,int x){
        int lo= 0;
        int hi = a.length-1;
        int ans =-1;
  
        while(lo<=hi){
          int mid = (hi+lo)/2;
          if(a[mid] <= x){
            ans = mid;
            lo = mid+1;
          }else{
           hi = mid-1;
          }
        }
        return ans;
      }

    static void duplicateInArrayApp2(int[] a){
      Arrays.sort(a);
      for(int i=0;i<a.length;i++){
        int loIndex = lowerIndex(a,a[i]);
        int UpIndex = UpperIndex(a, a[i]);

        int diff = UpIndex-loIndex+1;

        if(diff>1){
            System.out.print(a[i]+ " ");
            i=UpIndex;
        }
      }
    }

    public static void main(String[] args){
        int array[] = {2, 10,10, 100, 2, 10, 11,2,11,2};
        duplicateInArrayApp2(array);
    
    }
}
