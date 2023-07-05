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


public class Problem48 {
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
    static Node temp=null;
    public static boolean isPalindrome(Node head){
        temp = head;
        return isPalindromeHelper(head); 

    }

    public static boolean isPalindromeHelper(Node node){
        if(node == null){
            return true;
        }

        boolean ans = isPalindromeHelper(node.next);

         if(ans){
          if(node.data==temp.data){
            temp=temp.next;
            return true;
        }
        }
        return false;
    }

     public static void main(String[] args) {

        Problem46 list = new Problem46();
        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(2));
        list.push(new Node(1));
        list.push(new Node(13));
        // list.push(new Node(19));

        boolean isPal= isPalindrome(list.head);

        if(isPal){
            System.out.println("List is Palindrome");
        }else{
            System.out.println("List is not Palindrome");
        }
     }

}
