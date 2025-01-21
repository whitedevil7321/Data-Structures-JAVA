public class SinglyLinkedList {
        public Node head;
        public Node tail;
        public int size;


        public Node createSinglyLinkedList(int nodeValue) {
            head = new Node();
            Node node = new Node();
            node.next=null;
            node.value=nodeValue;
            head=node;
            tail=node;
            size=1;

            return node;


        } 
        public void InsertInTheList(int nodeValue ,int location) {
            Node node=new Node();
            node.value=nodeValue;
            if(head==null){
                createSinglyLinkedList(nodeValue);
            }
            else if(location==0){
                node.next=head;
                head=node;

            }
            else if(location>=size){
                node.next=null;
                tail.next=node;
                tail=node;

            }
            else{
                Node tempnode=head;
                int index=0;
                while(index<location-1){
                    tempnode=tempnode.next;
                    index++;

                }
                
            }

        }
   
}
