package Problems;

import Problems.Implementation.BinarySerachTreeImpl;

public class Problem74 {

     public static BinarySerachTreeImpl addNewNode(int data, BinarySerachTreeImpl node){
        if(node==null){
            node = new BinarySerachTreeImpl(data);
            return node;

        }

        if(data>node.data){
            node.right = addNewNode(data, node.right);
        }else if(data<node.data){
            node.left = addNewNode(data, node.left);
        }

        return node;
     }

     

     public static void main(String args[])
    {
        /* Let us create following BST
                50
              /   \
            30      70
            / \   / \
           20 40 60 80 */
 
        BinarySerachTreeImpl root = null;
        root = addNewNode(50,root);
        addNewNode(30,root);
        addNewNode(20,root);
        addNewNode(40,root);
        addNewNode( 70,root);
        addNewNode( 60,root);
        addNewNode(80,root);
 
        // Print inorder traversal of the BST
        BinarySerachTreeImpl.Inorder(root);
    }
    
}
