package Problems;

import Problems.Implementation.BinarySerachTreeImpl;

public class Problem77 {
    
    public static int lowestCommonAnc(BinarySerachTreeImpl node,int d1,int d2){

        if(d1<node.data && d2<node.data){
            return lowestCommonAnc(node.left, d1, d2);
        }else if(d1>node.data && d2 > node.data){
            return lowestCommonAnc(node.right, d1, d2);
        }else{
            return node.data;
        }
    }
    
}
