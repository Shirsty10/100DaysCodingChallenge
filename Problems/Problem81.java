package Problems;

import java.util.ArrayList;
import java.util.List;

import Problems.Implementation.BinarySerachTreeImpl;



public class Problem81 {

    public static List<BinarySerachTreeImpl> allPossibleFBT(int n) {
         List<BinarySerachTreeImpl> res = new ArrayList<>();
        if(n%2==0){
            return res;
        }
      if(n==1){
          res.add(new BinarySerachTreeImpl());
          return res;
      }
       
        for(int i=1;i<n;i=i+2){
           List<BinarySerachTreeImpl> left = allPossibleFBT(i);
           List<BinarySerachTreeImpl> right = allPossibleFBT(n-i-1);
        
        
        for(BinarySerachTreeImpl l: left){
            for(BinarySerachTreeImpl r : right){
                BinarySerachTreeImpl root = new BinarySerachTreeImpl(0);
                root.left = l;
                root.right = r;
                res.add(root);
            }
        }
        }
        return res;
    }

    public static void main(String[] args){
   
       List<BinarySerachTreeImpl> lst = allPossibleFBT(7);

       lst.stream().forEach(s-> System.out.println(s.toString()));
 
        

       
    }
    
}
