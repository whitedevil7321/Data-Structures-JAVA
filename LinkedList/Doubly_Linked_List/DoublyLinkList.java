public class DoublyLinkList {
    Node head;
    Node tail;
    int size;

    public Node CreatNode(int data){
        head=new Node();
        Node node=new Node();
        node.value=data;
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public void InsetNode(int data,int location){
       
        Node newnode=new Node();
        newnode.value=data;
        if(head==null){
            CreatNode(data);
        }
        else if(location==0){
            newnode.next=head;
            newnode.prev=null;
            head.prev=newnode;
            head.next=tail;
            head=newnode;
            
        }else if(location>=size){
            newnode.next=null;
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;
        }
        else{
            Node tempnode=head;
            int index=0;
            while(index<location-1){
                tempnode=tempnode.next;
                index++;
            }
            newnode.next=tempnode.next;
            newnode.prev=tempnode;
            tempnode.next=newnode;
            newnode.next.prev=newnode;
        }
        size++;}

        public void print(){
            if(head==null){
                return;
            }
            Node tempnode=head;
            int ind=0;
            while(ind<size){
                System.out.print(tempnode.value);
                if(tempnode.next!=null){
                    System.out.print("<-->");
                }
                tempnode=tempnode.next;
                ++ind;
            }
            System.out.println();
        }

        public void delete(int location){
        
            if(head==null){
                return;
            }
            Node tempnode=new Node();
            tempnode=head;
            if(location>=size){
                while(tempnode.next!=null){
                    tempnode=tempnode.next;
                }

                

            }
        }
}
