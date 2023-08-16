package Problems;

import java.util.ArrayList;

public class Problem85 {

    public static ArrayList<String> getStairPath(int n){
        if(n==0){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("");
            return bcase;
        }else if(n<0){
             ArrayList<String> bcase = new ArrayList<>();
            return bcase;
        }

         ArrayList<String> p1 = getStairPath(n-1);
         ArrayList<String> p2 = getStairPath(n-2);

         ArrayList<String> ans = new ArrayList<>();

         for(String p : p1){
            ans.add(1+p);
         }
          for(String p : p2){
            ans.add(2+p);
         }
       
         return ans;

    }
    public static void main(String args[])
    {
        int s = 4;
        System.out.println(getStairPath(s));
    }
    
}
