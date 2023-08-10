package Problems;

import Problems.Implementation.BinarySerachTreeImpl;

public class Problem79 {

    public static boolean find(BinarySerachTreeImpl root, int val){
        if(root == null) return false;
        if(val> root.data){
           return find(root.right, val);
        }else if(val<root.data){
           return find(root.left, val);
        }else{
            return true;
        }

    }
    
    public static void targetSumPair(BinarySerachTreeImpl root, BinarySerachTreeImpl node, int tar){
        if(node == null) return;

        targetSumPair(root, node.left, tar);
        int left = tar-node.data;
        if(node.data<left){
            if(find(root, left) == true){
                System.out.println(node.data + " " +left);
            }
        }
        targetSumPair(root, node.right, tar);
    }

    
    public static void main(String[] args){
        
        BinarySerachTreeImpl root = null;
        root = Problem74.addNewNode(50,root);
        Problem74.addNewNode(30,root);
        Problem74.addNewNode(20,root);
        Problem74.addNewNode(40,root);
        Problem74.addNewNode( 70,root);
        Problem74.addNewNode( 60,root);
        Problem74.addNewNode(80,root);
 
        targetSumPair(root, root, 60);

       
    }
}
