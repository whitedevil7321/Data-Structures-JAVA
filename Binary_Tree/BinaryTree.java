import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
    public static class Node{
        int data;
        Node left;
        Node right;
  
      
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BuildTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node node=new Node(nodes[idx]);
            node.left=buildTree(nodes);
            node.right=buildTree(nodes);
            return node;
            
        }
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



        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;

                    }
                    else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
             
                    
                

            }



        }
        public static int countnodes(Node node){
            if(node==null){
                return 0;
            }
            int left=countnodes(node.left);
            int right=countnodes(node.right);
            return left+right+1;

        }
         
        public static int sumNodes(Node node){
            if(node==null){
                return 0;
            }
            int left=sumNodes(node.left);
            int right=sumNodes(node.right);
            return left+right+node.data;

        }

        public static int countheights(Node node){
            if(node==null){
                return 0;
            }
            int left=countheights(node.left);
            int right=countheights(node.right);
            return Math.max(left,right)+1;
        }

        public static int diameter(Node node){
            if(node==null){
                return 0;
            }
            int ld=diameter(node.left);
            int rd=diameter(node.right);
            int wd=countheights(node.left)+countheights(node.right)+1;
            return Math.max(wd,Math.max(ld,rd));
        }
        public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
            Node root = BuildTree.buildTree(nodes);
            //System.out.println(root.data);
            //preorder(root);
            //inorder(root);
            //postorder(root);
            //levelorder(root);
            //System.out.println(countnodes(root));
            //System.out.println(sumNodes(root));
            //System.out.println(countheights(root));
            System.out.println(diameter(root));
          
            

        }
}
