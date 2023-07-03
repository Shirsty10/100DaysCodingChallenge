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

public class Problem46 {
    Node head;

    static Node removeDuplicates(Node head) {

        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp.next != null) {
            int val1 = temp.data;
            int val2 = temp.next.data;
            if (val1 == val2) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
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

    /* Method to print linked list */
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Problem46 list = new Problem46();
        list.push(new Node(13));
        list.push(new Node(16));
        list.push(new Node(16));
        list.push(new Node(16));
        list.push(new Node(17));
        list.push(new Node(19));

        Node res = removeDuplicates(list.head);

        list.printList(res);

    }

}
