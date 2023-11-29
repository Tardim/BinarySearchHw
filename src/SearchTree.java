import java.util.Queue;
import java.util.LinkedList;

public class SearchTree {
   Queue q = new LinkedList();
   Node root;

   public SearchTree(){
       root = null;
   }
   //Constructor creating new node
    public SearchTree(int value){
       root= new Node();
    }
    //Calls addValue method
    public void add(int data){
       root = addValue(root, data);
    }
    public Node addValue(Node root, int value){
       //if root is empty create a new value
       if(root == null){
           root = new Node(value);
           return root;
       }
       //if value is greater than root put right child
       else if (value > root.data) {
           root.right = addValue(root.right, value);
       }
       //if value is less than root put left child
       else if(value < root.data){
           root.left = addValue(root.left, value);
       }
       return root;
    }
    public void preOrder(){

    }
    public void postOrder(){

    }
    public void printInOrder(){
       inOrder(root);
    }
    public void inOrder(Node root){
       if(root != null){
           inOrder(root.left);
           System.out.println(root.data);
           inOrder(root.right);
       }

    }

}
