package Problems;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode random;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Problem55 {

     public static ListNode copyRandomList(ListNode head) {
       Map<ListNode,ListNode> map = new HashMap<>();

       ListNode cur=head;

       while(cur!=null){
          ListNode copyNode = new ListNode(cur.val);
           map.put(cur,copyNode);
           cur=cur.next;
       } 

       cur=head;
       while(cur!=null){
          ListNode copyNode = map.get(cur);
           copyNode.random = map.get(cur.random);
           copyNode.next = map.get(cur.next);
           cur=cur.next;
       }
       return map.get(head);
    }
    static void printList(ListNode head)
  {
    System.out.print(head.val + "(" + head.random.val
                     + ")");
    head = head.next;
    while (head != null) {
      System.out.print(" -> " + head.val + "("
                       + head.random.val + ")");
      head = head.next;
    }
    System.out.println();
  }

    public static void main(String[] args) {

       ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.random = head.next.next;
    head.next.random = head;
    head.next.next.random = head.next.next.next.next;
    head.next.next.next.random = head.next.next;
    head.next.next.next.next.random = head.next;
       

       ListNode res = copyRandomList(head);

        printList(res);

    }
}
