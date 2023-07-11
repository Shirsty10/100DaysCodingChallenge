package Problems;

import java.util.ArrayList;

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

public class Problem54 {
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

    public static Node swapNodes(Node head, int k) {
       ArrayList<Integer> l= new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            l.add(temp.data);
            temp=temp.next;
        }
        //swapping
         int t=l.get(k-1);
        int t1=l.get(l.size()-k);
         l.set(k-1,t1);
        l.set(l.size()-k,t);
        
        Node ntemp =head;
        for(int i=0;i<l.size();i++){
            ntemp.data=l.get(i);
            ntemp=ntemp.next;
        }
        return head;
    }

    public static void main(String[] args) {

        Problem54 list = new Problem54();
        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(3));
        list.push(new Node(4));
        list.push(new Node(5));
       

        Node res = swapNodes(list.head, 2);

        list.printList(res);

    }

}
