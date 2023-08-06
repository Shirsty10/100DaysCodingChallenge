package Problems;

import Problems.Implementation.BinarySerachTreeImpl;

public class Problem76 {
    static int sum=0;
    public static void replaceSumWithLarger(BinarySerachTreeImpl node){
       if(node == null){
        return;
       }
      
       replaceSumWithLarger(node.right);
       int oldVal= node.data;
       node.data = sum;
       sum+=oldVal;

        replaceSumWithLarger(node.left);


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
        BinarySerachTreeImpl.Inorder(root);
        System.out.println();

        replaceSumWithLarger(root);

        BinarySerachTreeImpl.Inorder(root);
    }
}
