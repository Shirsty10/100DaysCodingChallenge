package Problems;

import Problems.Implementation.GenericNode;

public class Problem71 {

    static int maxSum = Integer.MIN_VALUE;

    public static int maxSubTreeSum(GenericNode node){
      int sum=0;
        for(GenericNode child : node.childrens){
            int csum = maxSubTreeSum(child);
            sum+=csum;
        }

        sum+=node.data;

        if(sum> maxSum)
            maxSum = sum;

         return sum;   
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

        maxSubTreeSum(root);

        System.out.println("Maximum subtree sum is : " + maxSum);
        }
    
}
