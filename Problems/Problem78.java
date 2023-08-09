package Problems;

import Problems.Implementation.BinarySerachTreeImpl;

public class Problem78 {

    public static void printInRange(BinarySerachTreeImpl node, int d1,int d2){

        if(node == null) return;

        if(d1<node.data && d2<node.data){
            printInRange(node.left, d1, d2);
        }else if(d1<node.data && d2<node.data){
            printInRange(node.right, d1, d2);
        }else{
            printInRange(node.left, d1, d2);
            System.out.print(node.data + " ");
            printInRange(node.right, d1, d2);
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
 
         printInRange(root, 20, 70);

       
    }
    
}
