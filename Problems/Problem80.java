package Problems;

import java.util.ArrayList;
import java.util.List;


import Problems.Implementation.BinarySerachTreeImpl;

public class Problem80 {
    
    public void inorderTraversal(BinarySerachTreeImpl root,List<Integer> lst)
    {
        if(root!=null)
        {
            inorderTraversal(root.left,lst);
            lst.add(root.data);
            inorderTraversal(root.right,lst);
        }
    }
    public BinarySerachTreeImpl buildTree(List<Integer> lst ,int low,int high)
    {
        if(low > high)  return null;
        int mid = (low+high)/2;
        BinarySerachTreeImpl root = new BinarySerachTreeImpl(lst.get(mid));
        root.left = buildTree(lst,low,mid-1);
        root.right = buildTree(lst,mid+1,high);
        return root;
    }
    public BinarySerachTreeImpl balanceBST(BinarySerachTreeImpl root) {
        List<Integer> lst = new ArrayList<>();
        inorderTraversal(root,lst);
        root = buildTree(lst,0,lst.size()-1);
        return root;
    }
    public static void main(String[] args){
        Problem80 pr = new Problem80();
        
        BinarySerachTreeImpl root = null;
        root = Problem74.addNewNode(50,root);
        Problem74.addNewNode(30,root);
        Problem74.addNewNode(20,root);
        Problem74.addNewNode(40,root);
        Problem74.addNewNode( 70,root);
        Problem74.addNewNode( 60,root);
        Problem74.addNewNode(80,root);

        BinarySerachTreeImpl newroot= pr.balanceBST(root);

        BinarySerachTreeImpl.Inorder(newroot);
 
        

       
    }

}
