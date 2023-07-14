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

public class Problem56 {
    Node head;
    public static Node deleteMiddle(Node head) {
        if(head==null || head.next == null) return null;
        Node slow = head;
        Node fast = head.next.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
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

        Problem56 list = new Problem56();
        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(3));
        list.push(new Node(4));
        list.push(new Node(5));
       

        Node res = deleteMiddle(list.head);

        list.printList(res);

    }
}
