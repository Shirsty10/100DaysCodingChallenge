package Problems;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    Node() {
        next = null;
    }
}
public class Problem53 {
    Node head;
     public boolean hasCycle(Node head) {
        Node slowtemp = head;
        Node fasttemp = head;
         while(fasttemp!= null && fasttemp.next!=null){
             fasttemp = fasttemp.next.next;
             slowtemp=slowtemp.next;
             
             if(fasttemp==slowtemp)
                 return true;
         }
        return false;
    }

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

     public static void main(String[] args) {

        Problem53 list = new Problem53();
        list.push(new Node(3));
        list.push(new Node(2));
        list.push(new Node(0));
        list.push(new Node(-4));
        list.head.next.next.next = list.head;

        System.out.println("Is there any cycle in the List " + list.hasCycle(list.head) );


    }
}
