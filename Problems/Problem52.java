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

public class Problem52 {
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

    public static void removeNthNodeFromEnd(Node head , int n){
        if(head==null) return;

        Node slow = head;
        Node fast = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null){
            return;
        }

        while(fast.next !=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next = slow.next.next;
    }
    public static void main(String[] args) {

        Problem52 list = new Problem52();
        list.push(new Node(13));
        list.push(new Node(1));
        list.push(new Node(12));
        list.push(new Node(16));
        list.push(new Node(17));
        list.push(new Node(19));

        removeNthNodeFromEnd(list.head, 2);

        list.printList(list.head);

    }

}
