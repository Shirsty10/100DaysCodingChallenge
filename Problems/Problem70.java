package Problems;

import Problems.Implementation.GenericNode;

public class Problem70 {
    static int ceil = Integer.MAX_VALUE;
    static int floor=Integer.MIN_VALUE;

    public static void ceilAndFloor(GenericNode node,int data){
       
        if(node.data> data){
            if(node.data<ceil){
                ceil = node.data;
            }
        }
        if(node.data< data){
            if(node.data>floor){
                floor = node.data;
            }
        }

        for(GenericNode child : node.childrens){
            ceilAndFloor(child, data);
        }

    }

    public static void main(String[] args){
        int data = 74;
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

    ceilAndFloor(root, data);

    System.out.println("Ceil : " + ceil + " and floor : " + floor);
    }
    
    
}
