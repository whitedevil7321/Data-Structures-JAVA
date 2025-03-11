public class singlyLinkedList {

    public static class Node {
        int value;
        Node next;
    }

    Node head;
    Node tail;
    int size = 0;

    public void createNode(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;  // Corrected assignment
        tail = node;
        size++;
    }

    public void InsertElement(int value, int location) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            createNode(value);
        } else if (location == 0) {  // Insert at head
            node.next = head;
            head = node;
            size++;
        } else if (location >= size) {  // Insert at tail
            tail.next = node;
            node.next = null;
            tail = node;
            size++;
        } else {  // Insert at a specific position
            Node tempNode = head;
            int counter = 0;
            while (counter < location - 1) {
                tempNode = tempNode.next;
                counter++;
            }
            node.next = tempNode.next;  // First, link to next node
            tempNode.next = node;  // Then, update tempNode to point to new node
            size++;
        }
    }

    public void Traverse() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value);
            if (tempNode.next != null) {
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    public void valueofnth(int location){
        int itemposition=size-location;
        Node tempnode=head;
        int counter=0;
        while(counter<itemposition-1){
            tempnode=tempnode.next;
            counter++;
        }
        System.out.println("The value of the node is: "+tempnode.value);

    }

}
