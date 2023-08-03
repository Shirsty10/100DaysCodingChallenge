package Problems;

import Problems.Implementation.GenericNode;

public class Problem73 {
     static int ceil;
    static int floor;

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


    
    public static int KthLargestElement(GenericNode root, int K)
    {
        floor=Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
   
        
        for (int i = 0; i < K; i++) {
   
            ceilAndFloor(root, ans);
            ans = floor;
            floor = Integer.MIN_VALUE;
        }
   
    
        return ans;
    }

    public static void main(String[] args) {
    
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
       
        int K = 3;
        int ans = KthLargestElement(root, K);
        System.out.println(ans);
    }
}
