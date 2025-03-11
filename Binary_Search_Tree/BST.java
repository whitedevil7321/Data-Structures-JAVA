public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int values){
            this.data=values;
        }

    }
    public static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left, data);
        }
        else{
            root.right=insert(root.right, data);
        }
        return root;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);    
        preorder(root.right);

    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);    
        System.out.print(root.data+" ");
        inorder(root.right);

    }

 
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }



    public static boolean Search(Node root,int data){

        if(root==null){
            return false;
        }
       
        if(data<root.data){
            return  Search(root.left, data);
        }

        if(root.data==data){

            return true;
        }
        else{
            return Search(root.right, data);
        }
    


    }


    public static Node DeleteNode(Node root){
        if(root.left==null){
            return root;
        }
        else{
            return DeleteNode(root.left );
        }
        
        
        
            }
    public static void main(String[] args) {
    int values[]={10, 5, 15, 3, 7, 12, 17};
    Node root=null;
    
    for(int i=0;i<values.length;i++){
        root=insert(root, values[i]);
    }
    
    preorder(root);
    System.out.println();   
    inorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    if(Search(root,12)){
        System.out.println("Data found");
    }
    else{
        System.out.println("Data not found");


    }
 

    }
}
