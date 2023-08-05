package Problems;

import Problems.Implementation.BinarySerachTreeImpl;

public class Problem75 {
    
    public static BinarySerachTreeImpl removeNode(BinarySerachTreeImpl root, int data){
      
        if(root == null) return null;

        if(root.data<data){
             root.right = removeNode(root.right, data);
        }else if(root.data>data){
             root.left = removeNode(root.left, data);
        }else{
            if(root.left!= null && root.right!=null){
              int leftmax = max(root.left);
              root.data = leftmax;
              root.left = removeNode(root.left, leftmax);
              return root;
            }else if(root.left!=null){
                return root.left;
            }else if(root.right!=null){
                return root.right;
            }else{
                return null;
            }
        }

        return root;
    }

    public static int max(BinarySerachTreeImpl node){
        if(node.right!=null)
            return max(node.right);
        else
           return node.data;
         
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

        removeNode(root, 30);

        BinarySerachTreeImpl.Inorder(root);
    }
}
