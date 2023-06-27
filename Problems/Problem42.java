package Problems;


 
public class Problem42 {
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public Node reverseLL(Node head){
        if(head == null)
          return null;


          Node prev = null;
          Node curr = head;
          Node nextNode = null;

          while(curr!=null){
            nextNode = curr.next;
            curr.next = prev;
             prev= curr;
            curr = nextNode;
          
          }
          return prev;
    }
     // prints content of linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        Problem42 list = new Problem42();
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
 
        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverseLL(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
    
}
