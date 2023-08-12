package Problems.Implementation;


public class BinarySerachTreeImpl {
    
    public int data;
    public BinarySerachTreeImpl left;
    public BinarySerachTreeImpl right;

    public BinarySerachTreeImpl(int data){
        this.data=data;
        this.left = null;
        this.right=null;
    }

    public String toString(){
      return "[ "+ this.left + this.data + this.right + " ]";
    }

    public BinarySerachTreeImpl(){

    }

    public static void Inorder(BinarySerachTreeImpl root)
    {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
    }
}
