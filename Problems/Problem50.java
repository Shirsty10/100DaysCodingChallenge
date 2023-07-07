package Problems;

  class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }

        Node(){
            next=null;
        }

  }

 

public class Problem50 {
    Node head;
     public static int size(Node temp){
    if(temp==null) return 0;
    int count=0;
    while(temp!=null){
        count++;
        temp=temp.next;
    }

    return count;

  }

  public static int intersectionNode(Node n1,Node n2){
    Node temp1 = n1;
    Node temp2 = n2;

    int diff = Math.abs(size(temp1)-size(temp2));

    if(size(temp1)>size(temp2)){
     for(int i=0;i<diff;i++){
        temp1=temp1.next;
     }
    }else if(size(temp1)<size(temp2)){
      for(int i=0;i<diff;i++){
        temp2=temp2.next;
     }
    }

    while(temp1.data!=temp2.data){
        temp1=temp1.next;
        temp2=temp2.next;
    }

    return temp1.data;
  }
   public static void main(String[] args) {

        Problem46 list1 = new Problem46();
        list1.push(new Node(0));
        list1.push(new Node(1));
        list1.push(new Node(2));
        list1.push(new Node(4));
        list1.push(new Node(5));
        list1.push(new Node(6));

        Problem46 list2 = new Problem46();
        list2.push(new Node(9));
        list2.push(new Node(8));
        list2.push(new Node(4));
        list2.push(new Node(5));
        list2.push(new Node(6));

        int pt = intersectionNode(list1.head, list2.head);

        System.out.println("Intersection point is : " + pt);
     }
 
}
