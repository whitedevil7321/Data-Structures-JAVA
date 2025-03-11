public class BST {

    static class Node{
        int data;
        Node left;
        Node right;
    
      
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
         if(root==null)
         {
            root=new Node(val);
            return root;    
         }
         
          if(root.data>val){
                root.left=insert(root.left,val);
            }
            else{
                root.right=insert(root.right,val);
          }
            return root;
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void search(Node root, int val){
        if(root==null){
            System.out.println("Not found");
            return;
        }
        if(root.data==val){
            System.out.println("Found");
            return;
        }
        if(root.data>val){
            search(root.left,val);
        }
        else{
            search(root.right,val);
        }
    }
    public static void main(String[] args) {
        int values[]={6,7,9,3,2,1,4,8};
        Node root=null;

        for(int val:values){
            root=insert(root,val);
        }
        BST bst=new BST();
        bst.inorder(root);
        System.out.println();
        bst.search(root, 5);
    }

}
