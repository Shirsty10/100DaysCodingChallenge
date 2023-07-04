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

public class Problem47 {
    Node head;
       void push(Node node) {
        if (node == null)
            return;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    /* Method to print linked list */
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node reverseKNode(Node head, int k, int idx, int sets){
        if(idx>sets) return head;
        
        int num=0;
        Node prev = null;
        Node newhead = head;
        while(num<k){
           Node nextNode = head.next;
           head.next = prev;
           prev = head;
           head = nextNode;
           num++;
        }

        newhead.next = reverseKNode(head, k, idx+1, sets);

        return prev;
    }

    public static void main(String[] args) {

        Problem46 list = new Problem46();
        list.push(new Node(13));
        list.push(new Node(15));
        list.push(new Node(16));
        list.push(new Node(12));
        list.push(new Node(17));
        list.push(new Node(19));

        int k=3;

        int len =0;
        Node temp = list.head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        int sets = len/k;
        
       Node res = reverseKNode(list.head,k,1,sets);
       
       list.printList(res);

    }

}
