package SinglyLinkList;
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

            return head;


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
                Node nextnode=tempnode.next;
                tempnode.next=node;
                node.next=nextnode; 
                
            }
            size+=1;


        }
        public void print_linked_list() {
            Node node = head;
            while (node != null) { // Traverse until the end of the list
                System.out.print(node.value); // Print the value
                if (node.next != null) { // Check if there's a next node
                    System.out.print(" -> ");
                }
                node = node.next; // Move to the next node
            }
            System.out.println(); // Print a newline at the end
        }

        public void delete_element(int location){
            int counter =0;
            Node tempnode=head;
            if(location == 0) {
             head=tempnode.next;

            }
            else if(location>size){
                System.out.println("Location You gave s greater than the Size of Linked List");
            }
            else if(location==size) {
                int counter1=0;

            while(counter1 < location-1){
                tempnode=tempnode.next;
                counter1++;
                tempnode.next=tail;
            }
            
            }else{
                while(counter < location-1){
                    tempnode=tempnode.next;
                    counter++;
                }
                tempnode.next =tempnode.next.next;
     
            }

            
        }
        public void print_size(){
            System.out.println(size-2);
        }
        public void search(int value){
            int counter=0;
            Node tempnode=head;
            while(tempnode!=null){
                if(tempnode.value==value){
                    System.out.println("Value found at location "+counter);
                    break;
                }
                tempnode=tempnode.next;
                counter++;
            }
        }    
   
}
