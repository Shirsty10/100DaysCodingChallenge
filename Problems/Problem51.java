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

public class Problem51 {
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

  public static Node rotateList(Node head, int k){
    if(head == null || k==0) return null;
   
   int len = size(head);
    if(len ==0){
        return null;
    }

    Node slow = head;
    Node fast = head;

    k= k%len;

    for(int i=0;i<k;i++){
      fast = fast.next;
    }

    while(fast!=null && fast.next !=null){
        slow=slow.next;
        fast = fast.next;
    }

    fast.next = head;
    head = slow.next;
    slow.next = null;

    return head;
    
  }
    /* Method to print linked list */
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
  public static void main(String[] args) {

        Problem46 list1 = new Problem46();
        list1.push(new Node(0));
        list1.push(new Node(1));
        list1.push(new Node(2));
        list1.push(new Node(4));
        list1.push(new Node(5));
        list1.push(new Node(6));

       
       printList(list1.head);
        System.out.println("After Rotation list is : " );

        Node node = rotateList(list1.head,2);

        printList(node);
     }

}
