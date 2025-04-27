package AVL_Tree;
import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    AVL(){
        root=null;

    }

    public void preOrder(BinaryNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

         
    }
    public void postOrder(BinaryNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
        
         
    }
    public void InOrder(BinaryNode root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.println(root.data+" ");
        InOrder(root.right);
        
          
    }
    void levelOrder(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.println(presentNode.data+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }


    void search(BinaryNode node, int value){
        if(node==null){
            System.out.println("The AVL tree is empty");

        }
        if(value==node.data){
            System.out.println("The value is found in the AVL tree");
            return;
        }
        if(value<node.data){
            search(node.left,value);
        }
        else{
            search(node.right,value);
        }
    
    }

    
}
