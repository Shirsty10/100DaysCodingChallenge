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


public class Problem45 {
    
    Node head;
   
  void push(Node node){
            if(node == null)
            return;

            if(head == null){
                head = node;
            }else{
                Node temp =head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next = node;
            }
        }
  
     static Problem45 merge2SortedLL(Node l1,Node l2){
            Problem45 res = new Problem45();

            while(l1.next!=null && l2.next!=null){
                if(l1.data< l2.data){
                    res.push(new Node(l1.data));
                    l1=l1.next;
                }else if(l1.data> l2.data){
                    res.push(new Node(l2.data));
                    l2=l2.next;
                }else {
                    res.push(new Node(l2.data));
                    l2=l2.next;
                    l1=l1.next;
                }
            }

            while(l1!=null){
                 res.push(new Node(l1.data));
                    l1=l1.next;
            }
            while(l2!=null){
                 res.push(new Node(l2.data));
                    l2=l2.next;
            }

            return res;
        }
         /* Method to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
        

    public static void main(String[] args){
        
        Problem45 head1 = new Problem45();
        head1.push(new Node(13));
        head1.push(new Node(16));

        Problem45 head2 = new Problem45();
        head2.push(new Node(12));
        head2.push(new Node(19));

        Problem45 res = merge2SortedLL(head1.head,head2.head);
       
        res.printList();
       
    }
    
}