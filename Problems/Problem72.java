package Problems;

import Problems.Implementation.GenericNode;

public class Problem72 {
    static int dia =0;
    public static int diaOfTree(GenericNode root){
        int maxdeep1 = -1;
        int maxdeep2 = -1;

        for(GenericNode node : root.childrens){
            int ch = diaOfTree(node);

            if(ch>maxdeep1){
                maxdeep2 = maxdeep1;
                maxdeep1 = ch;
            }else if(ch>maxdeep2){
                maxdeep2 = ch;
            }
        }

        if(maxdeep1+maxdeep2+2 > dia){
            dia= maxdeep1+maxdeep2+2 ;
        }

        maxdeep1+=1;

        return maxdeep1;
    }

    public static void main(String[] args)
{
   
    // GenericNode root = new GenericNode('A');
    // (root.childrens).add(new GenericNode('B'));
    // (root.childrens).add(new GenericNode('F'));
    // (root.childrens).add(new GenericNode('D'));
    // (root.childrens).add(new GenericNode('E'));
    // (root.childrens.get(0).childrens).add(new GenericNode('K'));
    // (root.childrens.get(0).childrens).add(new GenericNode('J'));
    // (root.childrens.get(2).childrens).add(new GenericNode('G'));
    // (root.childrens.get(3).childrens).add(new GenericNode('C'));
    // (root.childrens.get(3).childrens).add(new GenericNode('H'));
    // (root.childrens.get(3).childrens).add(new GenericNode('I'));
    // (root.childrens.get(0).childrens.get(0).childrens).add(new GenericNode('N'));
    // (root.childrens.get(0).childrens.get(0).childrens).add(new GenericNode('M'));
    // (root.childrens.get(3).childrens.get(2).childrens).add(new GenericNode('L'));

    GenericNode root = new GenericNode('A');
    (root.childrens).add(new GenericNode('B'));
    (root.childrens).add(new GenericNode('C'));
    (root.childrens).add(new GenericNode('D'));
    (root.childrens.get(0).childrens).add(new GenericNode('E'));
    (root.childrens.get(0).childrens).add(new GenericNode('F'));
    (root.childrens.get(1).childrens).add(new GenericNode('G'));
    (root.childrens.get(1).childrens).add(new GenericNode('H'));
    (root.childrens.get(1).childrens).add(new GenericNode('I'));
    (root.childrens.get(2).childrens).add(new GenericNode('J'));
    (root.childrens.get(0).childrens.get(1).childrens).add(new GenericNode('N'));
    (root.childrens.get(1).childrens.get(1).childrens).add(new GenericNode('K'));
    (root.childrens.get(1).childrens.get(1).childrens).add(new GenericNode('L'));
    (root.childrens.get(1).childrens.get(1).childrens.get(0).childrens).add(new GenericNode('M'));
  diaOfTree(root);
    System.out.print(dia + "\n");
}
}
    

