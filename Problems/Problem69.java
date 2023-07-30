package Problems;
import Problems.Implementation.GenericNode;


public class Problem69 {

    public static boolean areMirror(GenericNode n1,GenericNode n2){
       if(n1.childrens.size()!= n2.childrens.size()){
        return false;
       }

       for(int i=0;i<n1.childrens.size();i++){
           int j=n1.childrens.size()-1-i;

           GenericNode c1 = n1.childrens.get(i);
           GenericNode c2 = n2.childrens.get(j);

           if(areMirror(c1, c2) == false){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args){

        GenericNode root = new GenericNode(10);
    (root.childrens).add(new GenericNode(2));
    (root.childrens).add(new GenericNode(34));
    (root.childrens).add(new GenericNode(56));
    (root.childrens).add(new GenericNode(100));
    (root.childrens.get(0).childrens).add(new GenericNode(77));
    (root.childrens.get(0).childrens).add(new GenericNode(88));
    (root.childrens.get(2).childrens).add(new GenericNode(1));
    (root.childrens.get(3).childrens).add(new GenericNode(7));
    (root.childrens.get(3).childrens).add(new GenericNode(8));
    (root.childrens.get(3).childrens).add(new GenericNode(9));

    GenericNode root2 = new GenericNode(10);
    (root2.childrens).add(new GenericNode(100));
    (root2.childrens).add(new GenericNode(56));
    (root2.childrens).add(new GenericNode(34));
    (root2.childrens).add(new GenericNode(2));
    (root2.childrens.get(3).childrens).add(new GenericNode(88));
    (root2.childrens.get(3).childrens).add(new GenericNode(77));
    (root2.childrens.get(1).childrens).add(new GenericNode(1));
    (root2.childrens.get(0).childrens).add(new GenericNode(9));
    (root2.childrens.get(0).childrens).add(new GenericNode(8));
    (root2.childrens.get(0).childrens).add(new GenericNode(7));

     System.out.println(areMirror(root, root2));


    }

    
    
}
