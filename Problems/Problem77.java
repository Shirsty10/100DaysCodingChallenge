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

    public static void main(String[] args){
        
        BinarySerachTreeImpl root = null;
        root = Problem74.addNewNode(50,root);
        Problem74.addNewNode(30,root);
        Problem74.addNewNode(20,root);
        Problem74.addNewNode(40,root);
        Problem74.addNewNode( 70,root);
        Problem74.addNewNode( 60,root);
        Problem74.addNewNode(80,root);
 
        // Print inorder traversal of the BST
       // BinarySerachTreeImpl.Inorder(root);
        System.out.println(lowestCommonAnc(root, 40, 60));

       
    }
    
}
