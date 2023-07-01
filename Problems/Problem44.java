package Problems;

public class Problem44 {

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

    public int middleOfList(){
      Node slow = head;
      Node fast = head;

      while(fast!=null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
      }

      return slow.data;
    }

      /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

      public static void main(String[] args)
    {
        Problem44 llist = new Problem44();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
         
          // Function call
        System.out.println("Middle element of list is : "+ llist.middleOfList());
    }
    
}
