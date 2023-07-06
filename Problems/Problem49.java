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

public class Problem49 {
   Node head;

   
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

    public static Node add2List(Node l1, Node l2){
        Node result = new Node();
        Node temp = result;
        int carry=0;
        while(l1!=null || l2!=null){
            int v1=0;
            int v2=0, sum=0;
            if(l1!=null && l2!=null){
                v1=l1.data;
                v2=l2.data;
                sum=v1+v2+carry;
                   l1= l1.next;
                   l2=l2.next;
            }else if(l1==null && l2!= null){
                v2=l2.data;
                sum= v2+carry;
                l2=l2.next;
            }else if(l2==null && l1!=null){
                v1=l1.data;
                sum=v1+carry;
                l1= l1.next;
            }
           
             //System.out.println(sum);
            carry = sum/10;
            int n= sum%10;
            
            Node nn = new Node(n);
            temp.next = nn;
            temp=temp.next;
         
        }
        if(carry!=0){
            Node nn = new Node(carry);
            temp.next=nn;
        }
        return result.next;
    }
  
    /* Method to print linked list */
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

     public static void main(String[] args){
        
        Problem49 head1 = new Problem49();
        head1.push(2);
        head1.push(4);
        head1.push(3);
        

        Problem49 head2 = new Problem49();
        head2.push(5);
        head2.push(6);
        head2.push(4);

       Node n =add2List(head1.head,head2.head);
       
        printList(n);
       
    }
}
